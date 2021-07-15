package com.revature.sre.day4.threads;
class Callme {
//JVM wait()    slow
	// 2 type methodlevel,   block level or statement level
	 void call( String msg){
		synchronized(this) {
			 System.out.print( "[" + msg );
			 try{
				 Thread.sleep(1000);
			 } catch (InterruptedException e) {
				 System.out.println( "Interrupted");
			 }
			 System.out.println( "]" );
		 }
		
		System.out.println("Thank you....");
		//JVM notify()
	}
}



class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;

	public Caller (Callme targ, String s){
		target = targ;
		msg = s;
		t = new Thread( this);
		t.start( );
	}

	public void run( ) {
		target.call( msg);
	}
}

class SynchDemo{
	public static void main (String args[ ] ){
		Callme target = new Callme( );
		Caller obj1 = new Caller( target, "Hello");
		
		Caller obj2 = new Caller( target, "Synchronized");
		Caller obj3= new Caller( target, "World");
		try {
			obj1.t.join( );
			obj2.t.join( );
			obj3.t.join( );
		} catch (InterruptedException e) {
   			System.out.println( "Interrupted");
		}
	}
}