package com.revature.sre.exceptions;

import java.io.File;
import java.io.FileReader;

public class Ex4Demo {

	
	public static void main(String[] args) {
			//try with resource 
		
		try(FileReader f=new FileReader("E:\\Demo.java")) 
		{
			
			
		}
		catch(Exception e) {
			
		}
		
		// finally -> not required     1.7
	
	}
}
