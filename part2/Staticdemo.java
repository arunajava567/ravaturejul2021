package com.revature.sre.day2.part2;
class Bank{  //instance vraiable 
	Integer id;
	String name;
	static String city="Hyderabad"; //static or class 
	Bank() {}
	public Bank(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	static void show() {
		System.out.println("show...");
	}
   void disp() {
		System.out.println(id+"  "+name+"  "+city);
	}
}
class AxisBank extends Bank
{
	AxisBank() {
	}
	  void disp() {
		    System.out.println(Bank.city);
			System.out.println(id+"  "+name+"  "+city);
		}
}
public class Staticdemo {

	
	 static void message() {
		 System.out.println(" Good afternoon");
	 }
	public static void main(String[] args) {
		
		Bank b1=new Bank(10,"ICICI");
		System.out.println(Bank.city); //using classname
		Bank.city="Chennai";
		System.out.println(Bank.city); //using classname
		
		b1.disp();
		Bank.show();  //sttaic method called with class
		Bank b2=new Bank(11,"HDFC");
		b2.disp();
		
        message(); //called directy within a class
	}

}
