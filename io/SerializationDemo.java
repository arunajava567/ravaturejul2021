package com.revature.sre.day4.io;


import java.io.*;

class Project implements Serializable {
	Integer id;
	String title;
	Double budget;
	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", budget=" + budget + "]";
	}
	public Project(Integer id, String title, Double budget) {
		super();
		this.id = id;
		this.title = title;
		this.budget = budget;
	}
	
	
}

public class SerializationDemo 
{
	public static void main(String args[]) 
	{
		try 
		{
			Project p=new Project(101,"AMEX",989878234.89);
			
			System.out.println("object1:  before serialize" + p);
			
			
			//serialization
			FileOutputStream fos = new FileOutputStream("e:\\ser.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			
			System.out.println("serialization suuccess");
			oos.close();
			fos.close();
		}
		catch(IOException e) 
		{
			System.out.println("Exception during serialization: " + e);
			
				} 
	}
}
		