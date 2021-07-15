package com.revature.sre.day4.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializaeDemo {

	public static void main(String[] args)  throws IOException,ClassNotFoundException{
	
		// deserialization
		FileInputStream fis = new FileInputStream("e:\\ser.txt");
		
		ObjectInputStream oos = new ObjectInputStream(fis);
		
		Project p=(Project)oos.readObject();
		
		System.out.println("DEserialization success");
		System.out.println(p.title+  " "+p.budget+"  "+p.id );
		oos.close();
		fis.close();
	}

}
