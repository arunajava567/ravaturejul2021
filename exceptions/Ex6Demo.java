package com.revature.sre.exceptions;

import java.util.Scanner;
//customException   , Throwable, Exeption or RuntimeException
class DepositException extends Exception {
	DepositException(String msg) {
		super(msg);
	}
}
public class Ex6Demo {
	public static void main(String[] args) throws DepositException
	{
		Scanner sc=new Scanner(System.in);
		int deposit=sc.nextInt();
		if(deposit<1000)
				 throw new DepositException("Minimum deposit amount is Rs.1000/-");
			else
				System.out.println("Thanks you for using services");
		

	}

}
