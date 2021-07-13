package com.revature.sre.day2.junit;

import org.junit.Test;

import junit.framework.TestCase;

public class Subtest extends TestCase {
	@Test
	public void test_returnEuro()
	{
	System.out.println("test if price per month returns in Euros");
	Subscription s=new Subscription(200,2);
	assertTrue(s.pricePerMonth()==1);
	}
	@Test
	public void test_roundup()
	{
		System.out.println("Test if pricePerMonth rounds up correctly.");
		Subscription s=new Subscription(200,2);
		assertTrue(s.pricePerMonth()==0.67);
	}
	

}
