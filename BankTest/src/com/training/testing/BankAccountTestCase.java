package com.training.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.domain.BankAccount;

public class BankAccountTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNullConstructors() {

		
		BankAccount account = new BankAccount(null, null, 0);
		
		
	}
	@Test
	public void testDepositPositive() {

		BankAccount account = new BankAccount("101", "Gaurav", 10000);
		double actual = account.deposit(-30000);
		assertEquals(10000, actual,0);
	}
	
	@Test
	public void testWithdrawlNegative() {

		BankAccount account = new BankAccount("101", "Gaurav", 10000);
		double actual = account.withdraw(30000);
		assertEquals(10000, actual,0);
	}

}
