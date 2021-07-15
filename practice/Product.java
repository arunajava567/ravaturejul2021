package com.revature.practice;

//local, instance variable.....sttaic variable
//encpasulation
public class Product { //instance variable
	int productId;
	String name;
	double qty;
	double price;
	double totalPrice;
	
	//constructor
	Product() { //initialization  2.empty constructor
		productId=101;
		name="Table";
		qty=10;
		price=1500;
		
	}
	public Product(int productId, String name) {
		this();
		this.productId = productId;
		this.name = name;
   }

                 //arguments or local variables
	public Product(int productId, String name, double qty, double price) {
		this.productId = productId;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public Product(double qty, double price, double totalPrice) {
					this(120,"Mobile");  //constructor chaining
					this.qty = qty;
					this.price = price;
					this.totalPrice = totalPrice;
				}
	void dispProductDetails() {
		
		System.out.println(productId+"  "+name+"  "+qty+"  "+ price);
	}
	
	void calctotalPrice() {
		double discount=0.0;//local
		totalPrice=qty*price;
		System.out.println("Total Price:"+totalPrice);
	}
              //local
	void show(String message ) {
		String uppercasemessage=message.toUpperCase(); //local
		System.out.println("Welcome"+ message);
		System.out.println(uppercasemessage);
	}
	
	//method take object as argument
	//return type can be argument
	Product customizeProduct(Product p) {
		Product pp=new Product();
		pp.name=p.name.toUpperCase();
		pp.qty=p.qty+500;
		pp.price=p.price+100;
	//	System.out.println(message);
		return pp;
	}
	
	public static void main(String[] args) {
		//int x=10;
		//String city="hyd";
		//1.default  constructor , JVM
		Product p=new Product(); //constructor
		//p.readProductDetails();
		p.dispProductDetails();
		p.calctotalPrice();
	
		Product p1=new Product(105,"Book",80,90); //constructor
		//p.readProductDetails();
		p1.dispProductDetails();
		p1.calctotalPrice();
		
		Product p2=new Product(106,"box"); //constructor
		//p2.show();
		
		Product p3=new Product(20,30,890);
		
		
		Product p4=p.customizeProduct(p1);
		System.out.println(p4.name+ " " +p4.qty+"  "+p4.price);
		p3.show(" Ram");
	}

}
