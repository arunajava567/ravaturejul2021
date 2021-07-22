package com.revature.bloodbank.client;


import java.util.Scanner;

import com.revature.bloodbank.controller.BloodBankController;
import com.revature.bloodbank.model.BloodBankCenter;

public class BloodbankApplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("====BloodBank Application===========");
		
		BloodBankController bcontroller=new BloodBankController();
		
		System.out.println("enter boold bank details");
		
		BloodBankCenter bloodBankCenter=new  BloodBankCenter();
		
		int centerId=sc.nextInt();sc.nextLine();
		String centerName=sc.nextLine();;
		 String street=sc.nextLine();;
		 String city=sc.nextLine();;
		String state=sc.nextLine();;
		 String pincode=sc.nextLine();
		 bloodBankCenter.setCenterId(centerId);
		 bloodBankCenter.setCenterName(centerName);
		 bloodBankCenter.setCity(city);
		 
		 bcontroller.addBloodBankCenter(bloodBankCenter);
		 
		 System.out.println(" Use case 1- Ading Blood bank ceneter is completed.");
		 
		 
		
	}
}
