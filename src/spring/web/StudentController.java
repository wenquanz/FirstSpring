package spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView student(){
		return new ModelAndView("student", "command", new Student());
	}
	
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	@ExceptionHandler({SpringException.class})
	public String addStudent(@ModelAttribute("SpringWeb")Student student, 
			ModelMap model){
		/**
		 * name's length >=5
		 */
		if(student.getName().length() < 5)
			throw new SpringException("Given name too short");
		else
			model.addAttribute("name", student.getName());
		/**
		 * age above 10
		 */
		if(student.getAge() < 10)
			throw new SpringException("Given age too slow");
		else
			model.addAttribute("age", student.getAge());
		
		model.addAttribute("id", student.getId());
		
		return "result";
	}
	
}
