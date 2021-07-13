package com.revature.sre.day2;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]=new int[5];
   a[0]=10;
   a[1]=230;
   a[2]=90;
   a[3]=45;
   a[4]=65;
   
   System.out.println(a);
   
   for(int  i=0;i<a.length;i++) {
	   System.out.println(a[i]);
   }
   
   System.out.println("for each loop");
   for(int x: a)
	   System.out.println(x);
 	

	int s[]= {2,3,4,1,5,6,7,8,9};
	int d[]=new int[5];
	System.arraycopy(s,3,d,2,3);
	for(int x:s)
		System.out.print(x+  "  ");
	System.out.println();
	for(int x:d)
		System.out.print(x+  "  ");
	
	
}
}
