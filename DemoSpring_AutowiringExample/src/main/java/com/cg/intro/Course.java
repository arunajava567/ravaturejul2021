package com.cg.intro;

public class Course {
	int id;
	String name;
	Course() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	
	public void start() {
		
		
		System.out.println("bean created...");
	}

	public void stop() {
		
		System.out.println("bean destroyed..");
	}
	
}
