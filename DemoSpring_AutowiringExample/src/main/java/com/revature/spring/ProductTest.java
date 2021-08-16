package com.revature.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("anno.xml");
		
		Product p1=(Product)factory.getBean("p");
		Product p2=(Product)factory.getBean("p");
		System.out.println(p1+"  "+p2.id+"  "+p2.name);
		
	}

}
