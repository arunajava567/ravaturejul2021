package com.revature.sre.day2.part2;

// abstract class  cannot be instantiaited
// ref varibale dummy variable can be created 
// multiple inheritance is not possible
// not pure abstract 
// super class role
abstract class Vehicle{
    abstract  int speed();
	abstract int milage();
	abstract void show();
  	 void disp() {
		 System.out.println(" in abstarct class");
	 }
}
abstract class Parking{
	abstract void walletParing();
}

class Bus extends Vehicle{
	int speed() {
   	 return 15;
    }
	 int milage() {
		 return 120;
	 }
	 void show() {
	 }
}

// in implementaion class all methods need to be implemented...
class Car  extends Vehicle   //,Parking
{   int speed() {
    	 return 5;
     }
	 int milage() {
		 return 10;
	 }
	 void show() {
	 }
}
public class Abstractdemo {
	public static void main(String[] args) {
		Vehicle v ;//new Vehicle();
		//Car c=new Car();
		 Car c=new Car(); // dynamic binding 
		 v=c;
		
		Vehicle v1=new Car();  //in line 
	   v1.show();
		
	}

}
