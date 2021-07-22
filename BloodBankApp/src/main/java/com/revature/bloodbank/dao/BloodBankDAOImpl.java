package com.revature.bloodbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.util.DBUtil;


public class BloodBankDAOImpl  implements BloodBankDAO{
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter) {
		
		try {
			Connection con=DBUtil.getConnection();
			PreparedStatement pst=con.prepareStatement("insert into BloodBankCenter values(?,?,?,?,?,?)");
			pst.setInt(1, bloodBankCenter.getCenterId());
			pst.setString(2, bloodBankCenter.getCenterName());
			pst.setString(3, bloodBankCenter.getStreet());
			pst.setString(4, bloodBankCenter.getCity());
			pst.setString(5, bloodBankCenter.getState());
			pst.setString(6, bloodBankCenter.getPincode());
			pst.execute();
			System.out.println("data inserted..");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
