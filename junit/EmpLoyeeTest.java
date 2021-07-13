package com.revature.sre.day2.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmpLoyeeTest {
	
	Employee emp;
	EmployeeService empService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		emp= new Employee();
		emp.setId(1);
		emp.setName("Uttam");
		emp.setSalary(40000.00);
		empService= new EmployeeService();
	}

	@After
	public void tearDown() throws Exception {
		emp=null;
		empService=null;
	}

	@Test
	public void testBounous() {
		//fail("Not yet implemented");
		
		assertEquals(4000,00,empService.calculateBounous(emp));
	}
	
	@Test
	public void testApprisal() {
		//fail("Not yet implemented");
		
		assertEquals(3000,empService.calculateAppriasal(emp));
	}

}
