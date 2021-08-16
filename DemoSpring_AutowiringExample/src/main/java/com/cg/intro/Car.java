package com.cg.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {

	public static void main(String[] args) {
		
		/*
		 Engine  e1 =new Engine(89765l);  // DI, constructor DI
		 
		
		System.out.println("Simple DI  : "+e1);
		
		*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("currencyconverter.xml");
		
		Engine e=(Engine)context.getBean("e");   //DI
		
		System.out.println("using Spring IOC container : ApplictaionContext : "+e);
		
		
		

	}

}
