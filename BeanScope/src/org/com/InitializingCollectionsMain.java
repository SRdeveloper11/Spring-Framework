package org.com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class InitializingCollectionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	        Country countryObj = (Country) appContext.getBean("CountryBean");
	       // countryObj.printListOfStates();
	}

}
