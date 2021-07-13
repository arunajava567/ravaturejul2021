package com.revature.sre.day2.part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticTest2 {

	  Arithmetic a;
	@BeforeEach
	void setUp()  { //initialization
		a=new Arithmetic();
	}

	@AfterEach
	void tearDown()  {
		 a=null;   //destroy
	}

	@Test
	void testSum() {
		assertEquals(10,a.sum(6, 4));
		//fail("Not yet implemented");
	}

	@Test
	void testSayMsg() {
		assertEquals("welcome",a.sayMsg());
		//fail("Not yet implemented");
	}

	@Test
	void testProduct() {
		assertEquals(20,a.product(5, 4));
		//fail("Not yet implemented");
	}

}
