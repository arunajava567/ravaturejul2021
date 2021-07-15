package com.revature.sre.day4.threads;
// how to create a thread
//creation of a thread, child thread 


class T1 extends Thread
{	  public void run() {
		  try {  for(int i=1;i<=100;i++)
			       {  System.out.println("child  in run method of T1"+i);
			        Thread.sleep(1000);
			       }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
class T2 extends Thread
{	  public void run() {
		  try {  for(int i=100;i<=200;i++)
			       {  System.out.println("child  in run method of T1"+i);
			        Thread.sleep(1000);
			       }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}

public class ThreadDemo1 {
	// thread -- main  JVM
	public static void main(String[] args) {
       T1 t1=new T1();
       t1.setName("Child1");
       t1.start();  // -> run
      
       
       t1.setPriority(1);  //1 min   5 norm  10 max
       System.out.println(t1.getPriority());
   //    System.out.println(Thread.currentThread().getName());
    //   System.out.println(t1.getName());
       
       //t1.yield();   //pause
       //t1.setDaemon(true); //weak
       //t1.isDaemon()
     //  t1.isInterrupted()
       //t1.interrupt();
       
       //t1.suspend();
       //t1.resume();
       try {
		   t1.join();
		   
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       T2 t2=new T2();
       t2.setName("Child2");
       t2.start();  // -> run
       System.out.println(Thread.activeCount());
       //main
       try {  
			 for(int i=200;i<=300;i++)
	           {  System.out.println("main method "+i);
	               Thread.sleep(1000);
	         }
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
       System.out.println(t1.isAlive());
       try {
		  
		   t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       System.out.println(t1.isAlive());
       System.out.println(Thread.activeCount());
	}

}
