package com.training.domain;

public class BankAccount {

	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(String accountNumber, String accountHolderName, double balance) {

		if (accountNumber == null || accountHolderName == null || balance < 0)
			throw new NullPointerException();

		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;

	}

	public double deposit(double amountDeposited) {
		if (amountDeposited >= 0)
			balance += amountDeposited;
		return balance;
	}

	public double withdraw(double amountWithdrawn) {

		/**
		 * For Testing Loop Test
		 */
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}

		if (balance >= amountWithdrawn && amountWithdrawn >= 0)
			balance -= amountWithdrawn;

		return balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountHolderName == null) ? 0 : accountHolderName.hashCode());
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}

}
