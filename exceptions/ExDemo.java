package com.revature.sre.exceptions;

public class ExDemo {

	public static void main(String[] args) {
		int x=0;
		try{
			 x=10/0;
			 System.out.println("REsult:"+x);  
			 
			 
			 
		}
		catch(ArithmeticException e) {
			 
			//System.out.println(e);
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thank you");
		
	}

}
