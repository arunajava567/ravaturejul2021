package com.revature.sre.day2.part2;
//interface is like a  class , cannot be instantiaited
//ref varibale dummy variable can be created 
//multiple inheritance is  possible
// pure abstract 
//super class role 
// by default all methods are public and abstract 
interface Vehicle1{
     int speed();
	 int milage();
	 void show();
}
interface Parking1{
	 void walletParing();
}
class Bus1  implements Vehicle1,Parking1{
	public void walletParing() {
	}
	public int speed() {
	 return 15;
     }
	public  int milage() {
		 return 120;
	 }
	public  void show() { }
}
//in implementaion class all methods need to be implemented...
class Car1  implements Vehicle1  //,Parking
{  public  int speed() {
 	 return 5;
    }
	public  int milage() {
		 return 10;
	 }
	public  void show() {
	 }
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vehicle1 v1;
      Car1 c=new Car1();
      v1=c;
      Vehicle1 v2=new Car1();
      
      
      
	}

}
