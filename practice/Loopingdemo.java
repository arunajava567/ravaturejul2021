package com.revature.practice;

import java.util.Scanner;

public class Loopingdemo {

	public static void main(String[] args) {
		
		
		int a[]= {2,3,4,5,6,7};
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		System.out.println("for each....");
		
		for(int x: a)
			System.out.println(x);
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
			int n=sc.nextInt();	//nextLong() , nextFloat()....
	   int i=0;
	   while(i<n) {
		   i++;
		   if(i==5)
		    continue;
		   System.out.println(i);
	   }*/
		/*int k=0;
		do {
			System.out.println(k);
			k++;
		}while(k<=20);
		
		
		System.out.println("for..........");
		for(int j=1;j<=10;j++)
			System.out.println(j);
		
*/
	}

}
