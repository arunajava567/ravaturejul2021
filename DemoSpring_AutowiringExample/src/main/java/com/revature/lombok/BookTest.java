package com.revature.lombok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.aop.CustomerBo;

public class BookTest {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer-AOP.xml");
		Book book = (Book) appContext.getBean("book");
		System.out.println(book.toString());
		System.out.println(book.isbn+"  "+book.title);
		
	}
}
