package com.revature.practice;

abstract class Loan{
	//lid, amount,baname;......
	abstract void apply();  //method without body or block
	abstract void docVerification () ;
	abstract void disbursement() ;
	abstract void getEmi() ;
}
//concrete class 
class HousingLoan extends Loan{
	void apply() {
		
	}
	void docVerification () {
		
	}
	 void disbursement() {
		 
	 }
	 void getEmi() {
		 
	 }
}
/*class PersonalLoan extends Loan{
	
}*/
class EducationLoan {
	
}


public class Abstractiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
