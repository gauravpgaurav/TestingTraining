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
		double actual = conv.dollarToRupees(10);

		assertEquals(681.9, actual, 0);
		// Delta depicts -/+ value permiteed (eg. Error Correction)
	}

	@Test
	public void test2() {
		
		CurrencyConverter conv = new CurrencyConverter();
		double actual = conv.dollarToRupees(10);
		assertNotNull(actual);
	}

}
