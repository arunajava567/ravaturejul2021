package com.revature.sre.day2.junit;


public class EmployeeService {
	
	double calculateBounous(Employee e){
		return 0.10*e.getSalary();
	}
	
	int calculateAppriasal(Employee e){
		
		if(e.getSalary()>50000){
			return 5000;
		}
		else{
			return 3000;
		}
	}

}
