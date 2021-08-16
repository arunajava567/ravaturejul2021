package com.revature.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {

	public static void main(String[] args) {
	//	Engine e=new Engine();  //dependency injection
	//	e.setId(101);
	//	e.setPrice(9989899.99);
		//System.out.println(e);
		
		ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("container.xml");
		//ApplicationContext c2=new FileSystemApplicationContext(new InputStreamReader(""));
		
		Engine e1=(Engine)container.getBean("e");//DI
		Engine e2=(Engine)container.getBean("e");//DI
		System.out.println(e1.hashCode()+ "  "+e2.hashCode());
		//System.out.println(e1.id+"  "+e1.price);
		e1.setId(809);
		System.out.println(e1.getId()+"  "+	e1.getPrice());
		
		
		Streering s1=(Streering)container.getBean("s");
		
		System.out.println(s1.getDia());
	//	container.destroy();
	//	container.close();
		//container.stop();
	}

}
