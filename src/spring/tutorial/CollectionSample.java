package spring.tutorial;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionSample {
	List<?> someList;
	Set<?> someSet;
	Map<?, ?> someMap;
	Properties someProp;
	public List<?> getSomeList() {
		System.out.println("about someList: " + someList);
		return someList;
	}
	public void setSomeList(List<?> someList) {
		this.someList = someList;
	}
	public Set<?> getSomeSet() {
		System.out.println("about someSet: " + someSet);
		return someSet;
	}
	public void setSomeSet(Set<?> someSet) {
		this.someSet = someSet;
	}
	public Map<?, ?> getSomeMap() {
		System.out.println("about someMap: " + someMap);
		return someMap;
	}
	public void setSomeMap(Map<?, ?> someMap) {
		this.someMap = someMap;
	}
	public Properties getSomeProp() {
		System.out.println("about someProp: " + someProp);
		return someProp;
	}
	public void setSomeProp(Properties someProp) {
		this.someProp = someProp;
	}
	
	

}
