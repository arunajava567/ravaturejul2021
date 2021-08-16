package com.revature.models.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	//ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("anno1.xml");
	
	AnnotationConfigApplicationContext factory= 
			new 
	AnnotationConfigApplicationContext(AppConfig.class);

	 Employee e=(Employee)factory.getBean("e");
	 e.setEid(101);
	 e.setEname("Ram");
	e.showEployeeDetails();
	
	
	
}
}
