package com.revature.sre.day4.io;

import java.io.*;

//IOException,  FileNotException, EOFException 
public class IODemo {

	public static void main(String[] args) throws IOException {
	
		//bytestreams , read byte by byte
		
		FileInputStream f1=new FileInputStream("e:\\revature.txt");
		
		FileOutputStream f2=new FileOutputStream("e:\\revatureoutput.txt",true);  //appending
		int k;
		while( (k=f1.read())!=-1)
		{
			 System.out.print((char)k);
			 f2.write((char)k);
			
		}
		f1.close();
		f2.close();

	}

}
