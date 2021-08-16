package com.capgemini;

public class Wheel {
	
	int id;
	Double price;
	
	
	Wheel(){}
	
	public Wheel(Double price) {
		super();
		this.price = price;
	}

	public Wheel(int id) {
		super();
		this.id = id;
	}

	public Wheel(int id, Double price) {
		super();
		this.id = id;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Wheel [id=" + id + ", price=" + price + "]";
	}
	
	public void start() {
		System.out.println("bean created...");
	}
	public void end() {
		System.out.println("bean  destroyed...");
	}

}
