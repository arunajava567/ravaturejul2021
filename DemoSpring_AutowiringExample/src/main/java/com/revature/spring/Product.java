package com.revature.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("p") //  <bean id="p" ......>
//@Scope("prototype")
public class Product {
	
	@Value("10")  //setter injection 
	int id;
	@Value("Bag")
	String name;
	
   public String productDetails() {
	   return id+"  "+name;
   }
   
   @PostConstruct   //init-method
	void init(){
		System.out.println("in init() - product  called thru @PostConstruct");
	}
	
	@PreDestroy  //destroy-method
	void destroy(){
		System.out.println("in destroy() -product is going to be destroyed called thru @PreDestroy");
	}
}
