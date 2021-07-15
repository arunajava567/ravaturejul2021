package com.revature.practice;
//overriding , dynamic 
class  Ride{
	
	void sq(int s) {
		System.out.println("area:"+s*s);
	}
	void show() {
		
	}
}
class Ride1 extends Ride{
	@Override
	void sq(int s) {
		System.out.println("perimeter:"+4*s);
	}
}

class Ride2 extends Ride1 {
	@Override
	void sq(int s) {
		System.out.println("volume:"+s*s*s);
	}
}
public class MRide {

	public static void main(String[] args) {
		
		int a=10;
		double x=2323.98;
		Ride r=new Ride();
		r.sq(2);
		r=new Ride1();
		r.sq(7);
		r=new Ride2();  //dynamic binding 
		r.sq(9);

	}

}
