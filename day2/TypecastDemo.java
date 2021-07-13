package com.revature.sre.day2;

class Loan {
	int a;
	
}
class HousingLoan extends Loan{ //IS a relation
	
	void disp() {
		System.out.println(a);
	}
}

 
class Account{   //composition, HAS a relation
	
	void show() {
		Loan l=new Loan();
		System.out.println(l.a);
	}
	
}
public class TypecastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		
		double b=a;  //implicit
		
		int ad=(int)b; //explicit
		
		Loan l=new Loan();
		
		HousingLoan hl=new HousingLoan();
		
		l=hl;  //implicit
		
		Loan l1=new HousingLoan();//implicit
		
		HousingLoan hl1=(HousingLoan)new Loan(); //explicit
		
		//Loan l2=new Account();
		
	}

}
