package com.revature.sre.day4.io;
import java.io.*;
public class IODemo1 {
	
		public static void main(String[] args)  {
		
			//bytestreams , read byte by byte
			//try with resource
			try( FileReader f1=new FileReader("e:\\revature.txt"); //slow 
				 BufferedReader b1=new BufferedReader(f1); //speedup , filter reader , thye cannot read directly  form input 
				 FileWriter f2=new FileWriter("e:\\revatureoutput1.txt",true);
				 BufferedWriter b2=new BufferedWriter(f2)   )
			{		 String line=null;
					while( (line=b1.readLine())!=null)
					{   System.out.print(line);
						f2.write(line);
					}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
