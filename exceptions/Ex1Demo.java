package com.revature.sre.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1Demo {
	public static void main(String[] args) {
   int a[]= {2,3,4};
   int b,c,d; //db connect, files, socket
      try {
    	  	try {  b=30;
    	  			c=2;
    	  				d=b/c;
    	  		}
    	  	catch(ArithmeticException e) { //runtime//unchecked 
    			System.out.println(e);
    		    }
    	  System.out.println(a[1]);
    	  Thread.sleep(1000);//compiletime/checked 
    	  FileReader f=new FileReader("e:\\Demo.java");
       }
  //unreachable code 

      catch(FileNotFoundException e) {
    	  
      }
      catch(IOException e) {
    	  
      }
      catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
     catch(Exception e) {
    	  
        }
      catch(Throwable e) {
    	  
      }
      finally {  //optional
    	    //resource release  con.close(), f.lcose()
    	  
      }
	System.out.println("Thank you ");
	}
}
