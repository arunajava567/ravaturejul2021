package com.cg.intro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class CourseTest {

	public static void main(String[] args) {
		
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("currencyconverter.xml");
		
	//	BeanFactory context=
	//		new XmlBeanFactory(new FileSystemResource("E:\\Capgemini-Oct-2020\\Module2-spring\\Spring5\\Spring 5\\Spring-Demo\\Spring5-Day1Demos\\Demo_XMLBaseConfig_1\\DemoSpring_2\\src\\main\\resources\\currencyconverter.xml"));
		Course c=(Course)context.getBean("c");   //DI
		
		//System.out.println("using Spring IOC container : ApplictaionContext   : Constructor DI: "+c);
		
		//Setter injection 
		System.out.println("Setter DI: "+c.getId() +"   "+c.getName());
		
		Course c1=(Course)context.getBean("c");   //DI
		
		System.out.println(c1  +"  "+ c1.hashCode()  +"  "+c.hashCode());
		context.destroy();
	}

}
