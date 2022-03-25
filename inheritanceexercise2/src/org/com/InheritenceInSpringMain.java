package org.com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class InheritenceInSpringMain {
    public static void main(String[] args) {
    ApplicationContext appContext = new    ClassPathXmlApplicationContext("ApplicationContext.xml");
    Employee emp=(Employee) appContext.getBean("employeeBean");
    System.out.println("Employee name:"+emp.getName()+" Employee age:"+emp.getAge()+" Contact Number:"+emp.getContactno());
    
  //  System.out.println("Employee number:"+emp.getEmployeeNumber());
    
    }
}