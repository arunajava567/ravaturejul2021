package com.revature.sre.day4.io;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();  
        sc.nextLine(); //clear buffer //after read int,float,double....with scanner
        String name=sc.nextLine(); //buffre is cleared auto
        int marks=sc.nextInt();
        System.out.println(age+"  "+name+  "  "+marks);

	}

}
