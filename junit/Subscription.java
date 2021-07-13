
package com.revature.sre.day2.junit;
public class Subscription {
 private int price;
 private int length;
 public Subscription(int p,int n)
 {
	 price=p;
	 length=n;
 }
 public double pricePerMonth()
 {
	// int r=price/length;
	 double r = Math.round(((double) price / (double) length) / 100); 

	 return r;
 }
 public void cancel()
 {
	 length=0;
 }
 
}
