package com.training.tests;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.samples.domain.PerfectNumber;

@RunWith(Parameterized.class)
public class TestPerfectNumberByParameter {

	private int numbers;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	public TestPerfectNumberByParameter(int numbers) {
		super();
		this.numbers = numbers;

	}

	@Test
	public void testPerfectByParam() {
		PerfectNumber perfectObj = new PerfectNumber(numbers);
		Boolean actual = perfectObj.isPerfectNumber();
		assertTrue(actual);
	}

	@Parameters
	public static Collection<Object> data() {
		Object[] data = new Object[] { 6, 28, 33, 44, 496 };
		return Arrays.asList(data);
	}

	// @Parameters
	// public static Collection<Object[]> data() {
	// Object[][] data = new Object[][] { { 6 }, { 28 }, { 33 }, { 44 } };
	// return Arrays.asList(data);
	// }

}
