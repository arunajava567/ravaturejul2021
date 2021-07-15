package com.revature.practice;

public class PolyDemo {
	//sq, rect,circle
	//overloading
	void area(int s) {
		System.out.println("Square:"+s*s);
	}
	void area(int l,int b) {
		System.out.println("Rect:"+(l*b));
	}
	void area(double r) {
    	System.out.println("Circle:"+(3.142*r*r));
	}
	

	public static void main(String[] args) {
		PolyDemo p=new PolyDemo();
		p.area(6);
        p.area(4, 5);
        p.area(8.5);
        

	}

}
