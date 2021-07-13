package com.revature.sre.day2;

//import java.lang.String;

//custom class cannot be predefined names system,Strng,Date...Exception,Thread

public class Stringdemo {

	public static void main(String[] args) {
		
		int a=10;
		String s1="Revature"; //string literal
		String s2=new String("Revatureabcd t sanbvsac t"); //string object 
		//immutable
		
		System.out.println(s1.length());
		System.out.println(s1.substring(2,5));
		System.out.println(s1.startsWith("R"));
		System.out.println(s1.concat("Technologies"));
		System.out.println(s1);
		System.out.println(s1.replace("a","A"));
		System.out.println(s2.indexOf("t"));
		System.out.println(s2.lastIndexOf("t"));
		
		//mutable, will not create duplicates, synchronized, slow 
		StringBuffer sb=new StringBuffer(s1); //string to stringbuffer
		System.out.println(sb.length());
		System.out.println(sb.insert(3,"XXX"));
		System.out.println(sb);
		System.out.println(sb.delete(3,6));
		System.out.println(sb);
		sb.append(34567);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		
		StringBuilder sb2=new StringBuilder(s1); //string string builder
		//not synchronized, fast,mutable, not create duplciates
		System.out.println(sb2.length());
		System.out.println(sb2.reverse());
		
		
		String ss1=sb.toString();//stringbuffer to string 
		String ss2=sb2.toString(); //stringbuilde rto string 
		
		String s10="Java";
		String s11="Java123";
		 System.out.println(s10==s11);
         System.out.println(s10.equals(s11));		

	}

}
