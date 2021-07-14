package com.revature.sre.exceptions;

public class Ex2Demo {

	
	public static void main(String[] args) {
		String s=null;
		
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Thank you");
	}
}
