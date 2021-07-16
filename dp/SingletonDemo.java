package com.revature.sre.day5.dp;
//singleton -> restricting to create one single object
//  ex:  connection, logger
class Singleton1 {  // singleton eagerly -compiletime 
	private  static Singleton1 s;//=new Singleton1();  // create statically
	private Singleton1() {}   //private constructor 
	public static Singleton1 getInstance() { //lazy creation of singleton-runtime 
		if(s==null) {
		s=new Singleton1();
		}
		return s;
	}
}
public class SingletonDemo {
	public static void main(String[] args) {
		//Singleton1  s1=new Singleton1 ();
		Singleton1 s1=Singleton1.getInstance();
		
		Singleton1 s2=Singleton1.getInstance();
		Singleton1 s3=Singleton1.getInstance();
		
		System.out.println(s1+  "  "+s2+"  "+s3);

	}

}
