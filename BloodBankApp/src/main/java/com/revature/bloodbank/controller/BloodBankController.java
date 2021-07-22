package com.revature.bloodbank.controller;

import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.service.BloodBankService;
import com.revature.bloodbank.service.BloodBankServiceImpl;

public class BloodBankController {
	
	BloodBankService bloodBankServiceImpl=new BloodBankServiceImpl();
	 public  void addBloodBankCenter(BloodBankCenter bloodBankCenter ) {
		   
		  try {
			bloodBankServiceImpl.addBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	

}
