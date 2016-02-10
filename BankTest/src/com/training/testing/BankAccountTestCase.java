package com.training.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.domain.BankAccount;


public class BankAccountTestCase {

	BankAccount account = null;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNullValuesConstructors() {

		try {
			BankAccount account2 = new BankAccount(null, null, 0);
			assertNull(account2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test(expected = NullPointerException.class)
	public void testNullPointerConstructors() {

		BankAccount account2 = new BankAccount(null, null, 0);
		assertNull(account2);
	}

	@Test
	public void testAccountNumberInitialization() {

		try {
			account = new BankAccount("101", "Gaurav", 10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals("101", account.getAccountNumber());
	}

	@Test
	public void testAccountHolderNameInitialization() {

		try {
			account = new BankAccount("101", "Gaurav", 10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals("Gaurav", account.getAccountHolderName());
	}

	@Test
	public void testAccountBalanceInitialization() {

		try {
			account = new BankAccount("101", "Gaurav", 10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(10000, account.getBalance(), 0);
	}

	@Test
	public void testDepositPositive() {

		try {
			account = new BankAccount("101", "Gaurav", 10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		double actual = account.deposit(-30000);
		assertEquals(10000, actual, 0);
	}

	@Test
	public void testDepositValue() {

		try {
			account = new BankAccount("101", "Gaurav", 10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		double actual = account.deposit(30000);
		assertEquals(40000, actual, 0);
	}

	@Test
	public void testDepositValueReturnType() {

		try {
			account = new BankAccount("101", "Gaurav", 10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Double actual = account.deposit(30000);
		
		if (!(actual instanceof Double))
			fail("Deposit Return Type Not double");
	}

	@Test
	public void testWithdrawlNegative() {

		try {
			account = new BankAccount("101", "Gaurav", 10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		double actual = account.withdraw(30000);
		assertEquals(10000, actual, 0);
	}

	@Test(timeout = 100)
	public void testNoLoopInWithdraw() {
		try {
			account = new BankAccount("101", "Gaurav", 10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		double actual = account.withdraw(3000);
		assertEquals(7000, actual, 0);
	}
}
