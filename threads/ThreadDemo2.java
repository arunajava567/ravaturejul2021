package com.revature.sre.day4.threads;
class X{
	
}
public class ThreadDemo2 extends X implements Runnable{
	public void run() {
		try {
			for(int i=0;i<=10;i++) {
				System.out.println("Child1:" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadDemo2 t1=new ThreadDemo2();
		//aditional step
		Thread t=new Thread(t1);
		t.start();
		
		
		

	}

}
