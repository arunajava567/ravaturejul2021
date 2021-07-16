package com.revature.sre.day5.dp;
//Prototyping
public class Employee  implements Cloneable{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Object clone()  throws CloneNotSupportedException
	{
		return super.clone(); //Object 
	}
	
	//exception propagation
	void disp() throws CloneNotSupportedException {
		clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employee e1=new Employee(101,"Ram");
		System.out.println(e1);
		Employee e2=(Employee)e1.clone();
		System.out.println(e2);
	}

}
