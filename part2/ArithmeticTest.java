package com.revature.sre.day2.part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticTest {

	@Test  //test logic 
	void testSum() {
		
		Arithmetic a=new Arithmetic();
		//9 is expected output
		// actual output
		assertEquals(9,a.sum(4, 5));
		//fail("Not yet implemented");
	}

}
