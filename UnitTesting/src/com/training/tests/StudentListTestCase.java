package com.training.tests;

import com.training.samples.StudentList;

import static org.junit.Assert.*;
import org.junit.*;

public class StudentListTestCase {

	StudentList listIns = new StudentList();

	@Before
	public void setUp() throws Exception {
		System.out.println("========== Before Called ==========");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("========== After Called ==========");
	}

	@Test
	public void test1() {
		// Checking if Not Null
		assertNotNull(listIns.getNames());
	}

	@Test
	public void test2() {
		// Checking if Not Duplicate
		if (listIns.getNames().size() != 2)
			fail("Improper Set");
	}

}
