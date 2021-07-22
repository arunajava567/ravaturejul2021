package com.revature.bloodbank.service;

import com.revature.bloodbank.dao.BloodBankDAO;
import com.revature.bloodbank.dao.BloodBankDAOImpl;
import com.revature.bloodbank.model.BloodBankCenter;

public class BloodBankServiceImpl implements BloodBankService{
	BloodBankDAO bloodBankDaoImpl=new BloodBankDAOImpl();
	
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter) {
		try {
			bloodBankDaoImpl.addBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
