package com.revature.sre.day2;

//constructor  ,initialization 

//this and super


class Vehicle{
	int age=90;
	int id;  //instance scope , object 
	String name;
	int speed;
	int milage;
	Vehicle() { //emty
	//	System.out.println("in parent class");
		 id=101;
		 name="Car";
		speed=80;
		milage=20;
	}
	   
	//local
	public Vehicle(int id, String name, int speed, int milage) {
		this.id = id;
		this.name = name;
		this.speed = speed;
		this.milage = milage;
	}

	public Vehicle(int id, String name) {
		this();
		this.id = id;
		this.name = name;
		
	}

	
	public Vehicle(int speed, int milage) {
		 this(33,"Bike");  
		//constructor chaining
		this.speed = speed;
		this.milage = milage;
		
	}

	void show() {
	//	 int expenses=0; //local
	//	System.out.println(id +"  "+name +"  "+speed+  "  "+milage);
	System.out.println("show method in super");
	}
}
class Car extends Vehicle{
	int age=60;
	
	String  engineCapacity;
	
	Car() {
		//System.out.println("in sub class");
		//super();//super class construtcor
		
		engineCapacity="large 100";
	}

	public Car(String engineCapacity) {
		//super()
		super(102,"sportscar",200,5);
		this.engineCapacity = engineCapacity;
	}
	
	void disp() {
		System.out.println(id +"  "+name +"  "+speed+  "  "+milage);
		System.out.println(engineCapacity);
		System.out.println(this.age   +"  "+super.age);
		this.show();
		super.show();
		
	}
	
	void show() {
	//	super.show();
	System.out.println(engineCapacity+   "" +id +  " "+name +"  "+speed+"  "+milage);
	}
	
	
	
}

class SportsCar extends Car{
	SportsCar() {
	//	System.out.println("in sub class=====boat");
	}
	void disp() {
		super.show();
		this.show();
		
	}
	void show() {
		
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {  //runtime 
	/*	int x=9;//local
		
		Vehicle v1=new Vehicle();//instantiation, constructor
		v1.show();
		Vehicle v2=new Vehicle(20,"Bus",60,10);//instantiation, constructor
		v2.show();
		Vehicle v3=new Vehicle(22,"Boat");//instantiation, constructor
		v3.show();
		Vehicle v4=new Vehicle(50,60);//instantiation, constructor
		v4.show();*/

		
		Car c1=new Car("Medium 200");  // inheritance
		//System.out.println(c1.engineCapacity);
		c1.show();
	//	c1.disp();
	//	Boat b=new Boat();
		
		
	}

}
