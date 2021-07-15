package com.revature.sre.day4.io;


import java.io.*;
public class LineNumberReaderExample{
  public static void main(String[] args) throws Exception{
 
  FileReader freader = null;
  LineNumberReader lnreader = null;
  try{
  
  freader = new FileReader("e:\\Hello.java");
  lnreader = new LineNumberReader(freader);// adding line 
  String line = "";
  while ((line = lnreader.readLine()) != null){
  System.out.println("Line:  " + lnreader.getLineNumber() + ": " + line);
  }
  }
  finally{
  freader.close();
  lnreader.close();
  }
  }
}