package com.revature.sre.day2;
//java.lang
//wrapper
//Integer,Byte,Short,Long,Float,Double,Character,Boolean
//primitive -not safe 
//int,byte,short,long,float,double,char,boolean=

public class Wrapperdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ii1=10;
		//boxing  -- primitive to object 
		Integer i1=new Integer(ii1); //int in the fomr object
		System.out.println("auto unboxed int values :"+(i1+232));
		
		int ii2=i1.intValue(); // unboxing    object to primitive
		
		double x=8987.786; //primitive
		
		Double dx=new Double(x); //object   boxing
		
		System.out.println("autounboxedvalues :"+ dx);
		
		double dxval=dx.doubleValue();  //unboxing
		
		
		System.out.println(i1); //autoboxing , autounboxing
	}

}
