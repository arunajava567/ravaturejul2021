package com.revature.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AppAOP {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer-AOP.xml");

		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
	//	customer.addCustomer();
		
	//	customer.addCustomerReturnValue();
		
		//customer.addCustomerThrowException();
		
		customer.addCustomerAround("RevatureUser1");

	}
}