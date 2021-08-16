package com.revature.spring;

public class Engine {
	
	private Integer id;
	private Double price;
	Engine() {
		
	}
	
	
	public void begin() { //initialization
		
		System.out.println("bean created..");
		
	}
	public void end() { //destroy
		System.out.println("bean is getting destroyed..");
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
		return "Engine [id=" + id + ", price=" + price + "]";
	}
	public Engine(Integer id, Double price) {
		super();
		this.id = id;
		this.price = price;
	}
	

}
