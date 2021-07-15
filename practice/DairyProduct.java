package com.revature.practice;
//inheritance 
//sub, child, derived 
public class DairyProduct extends Product{  //super, parent, base
	String expDate;
	String type;
	void disptypeOfProduct() {
		System.out.println(type+"  "+expDate);
	}
	@Override
	void show(String msg)
	{
		System.out.println(msg.toLowerCase());
	}
	public static void main(String[] args) {
		DairyProduct dp=new DairyProduct();
	//	dp.readProductDetails();
	//	dp.name="JercycowMilk";
	//	dp.calctotalPrice();
	//	dp.dispProductDetails();
		dp.type="milk";
		dp.expDate="15/07/2021";
		dp.disptypeOfProduct();
		//dp.show();
		
	}
	

}
