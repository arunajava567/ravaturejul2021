package com.revature.sre.day2.junit;

import com.revature.sre.day2.part2.X;

//sttaic imports -> sttaic variables
import static com.revature.sre.day2.part2.X.*;

public class Varargsdemo {

	//varargs
	 public void sum(int...a) {
		 int s=0;
		 for(int i=0;i<a.length;i++)
			 s+=a[i];
		 System.out.println("sum=:"+s);
	 }
	public static void main(String[] args) {
		Varargsdemo v=new Varargsdemo();
		
		v.sum(2,3,4,5,6,7);
		v.sum(2,5);;
		v.sum(6,7,4,6,7,5,6,7,7,6,7);
		
		//X x=new X();
		//System.out.println(X.age);
		//System.out.println(X.y);
		//X.show();

		System.out.println(age+   "  " + y);
		show();
	}

}
