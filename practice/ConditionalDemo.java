package com.revature.practice;

import java.util.Scanner;

public class ConditionalDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("entre voter age");
			int age=sc.nextInt();	//nextLong() , nextFloat()....
			if(age>18)
				 System.out.println("eligible...");
			else
				System.out.println("Not eligible...");
		
		System.out.println("enter dept code");
		int dcode=sc.nextInt();
		switch( dcode)
		{
		case 10:  { System.out.println("IT"); 
		            break;
					}
		case 20:  { System.out.println("INFRA"); 
				break;
		}
		case 30:  { System.out.println("PF"); 
				break;
		}
     	case 40:  { System.out.println("Operations"); 
				break;
		}
		default : System.out.println("No dept found");
		}
		
		
		}

	}


