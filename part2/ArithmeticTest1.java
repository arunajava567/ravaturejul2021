package com.revature.sre.day2.part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticTest1 {

	@Test
	void testSum() {
		Arithmetic a=new Arithmetic();
		assertEquals(9,a.sum(4, 5));
		assertNotEquals(10,a.sum(4, 5));
	}

	@Test
	void testSayMsg() {
		Arithmetic a=new Arithmetic();
		assertEquals("welcome123",a.sayMsg());
	//	fail("Not yet implemented");
	}

}
