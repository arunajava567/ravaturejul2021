package com.revature.sre.day2.junit;



import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTest {

	String obj1 = "junit";
	String obj2 = "junit";

	String obj3 = "test";
	String obj4 = "test";

	String obj5 = null;

	int var1 = 1;
	int var2 = 1;

	int var3 = 1;
	int var4 = 2;

	int[] arithmetic1 = { 1, 2, 3 };
	int[] arithmetic2 = { 1, 2, 3 };

	@Test
	public void testEquals() {

		assertEquals(obj1, obj2);
		assertNotEquals(obj1, obj3);

		System.out.println("@Test: AssertionsTest");

	}

	@Test
	public void testSame() {
		assertSame(obj3, obj4);
		assertNotSame(obj2, obj4);

	}

	@Test
	public void testNull() {
		assertNotNull(obj1);
		assertNull(obj5);

	}

	@Test
	public void testBoolean() {
		assertTrue(var1 == var2);
		assertFalse(var2 == var4);

	}

	@Test
	public void testArray() {
		assertArrayEquals(arithmetic1, arithmetic2);
	}
}
