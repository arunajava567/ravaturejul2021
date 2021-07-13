package com.revature.sre.day2.part2;

//final   class cannot be inherited
class School{
	// values cannot varied /modified
	final double p=3.142;
	final int x=10;
	String principle;
	
	//final methods cannot be overriden
	void show() {
		System.out.println(x);
		//System.out.println(p+=10);
	}
}
class SRMSchool extends School 
{    @Override
	 void show() {
		 System.out.println(" in sub class");
	 }
}
public class Finaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s=new School();
		s.show();
		SRMSchool s1= new SRMSchool();
		s1.show();
	}

}
