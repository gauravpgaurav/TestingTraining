package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.CurrencyConverter;

public class FirstTestCase {

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
		// fail("Not yet implemented");

		CurrencyConverter conv = new CurrencyConverter();
		double actual = conv.dollarToRupees(100);

		assertEquals(6819, actual, 0);
	}

	@Test
	public void test2() {
		fail("Not yet implemented");
	}

}
