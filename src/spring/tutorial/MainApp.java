package spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class MainApp {
//	public static void main(String[] args) {
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		
//		//test singleton scope bean
////		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
////		objA.setMessage("I'm A");
////		objA.getMessage();
////		
////		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
////		objB.getMessage();
//		
//		//test inheritence
//		HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
//		hw.getMessage1();
//		hw.getMessage2();
//		
//		HelloChina hc = (HelloChina) context.getBean("helloChina");
//		hc.getMessage1();
//		hc.getMessage2();
//		hc.getMessage3();
//		
//		//test inner bean
////		TextEditor te = (TextEditor) context.getBean("textEditor");		
////		te.checkSpell();
//		
//		//test collection injection
//		CollectionSample cs = (CollectionSample) context.getBean("collection");
//		cs.getSomeList();
//		cs.getSomeMap();
//		cs.getSomeProp();
//		cs.getSomeSet();
//		/**
//		 * for destroy a singleton bean
//		 */
//		context.registerShutdownHook();
//	}
//}
