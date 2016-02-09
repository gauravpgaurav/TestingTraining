package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		fail("Not yet implemented");
	}

}
