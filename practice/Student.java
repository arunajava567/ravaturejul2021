package com.revature.practice;

//encapsulation   
// public  -> protected -> default  ->private

public class Student {
	protected  int id;
	 String name;
	void dispstudentDetails() {
		System.out.println(id+"  "+name);
	}
	public static void main(String[] args) {
		
		Student s=new Student();
		s.id=10;
		s.name="Ram";
		s.dispstudentDetails();

	}

}
