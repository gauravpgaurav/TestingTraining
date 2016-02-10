package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.domain.PerfectNumber;

public class PerfectNumberTest {

	PerfectNumber number = null;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = ExceptionInInitializerError.class)
	public void testPositiveInput() {
		try {
			number = new PerfectNumber(2);
			System.out.println(number);
		} catch (ExceptionInInitializerError e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testIsPerfect() {

		number = new PerfectNumber(6);
		Boolean actual = number.isPerfectNumber();
		System.out.println(number);
		assertEquals(actual, true);
	}

	@Test
	public void testPerfectList() {

		number = new PerfectNumber(6);
		number.printPerfectNumberList(8130);

	}

}
