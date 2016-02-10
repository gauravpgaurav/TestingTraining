package com.training.samples.domain;

import java.util.ArrayList;

public class PerfectNumber {

	private int number;
	private int sum;
	private ArrayList<Integer> factorArray;

	private void generateFactorArray() {

		for (int i = 1; i <= number; i++) {

			if (number % i == 0)
				factorArray.add(i);
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ArrayList<Integer> getFactorArray() {
		return factorArray;
	}

	public void setFactorArray(ArrayList<Integer> factorArray) {
		this.factorArray = factorArray;
	}

	public PerfectNumber(int number) {
		super();
		if (number > 0) {
			this.number = number;
			factorArray = new ArrayList<>();
			generateFactorArray();
		} else
			throw new IllegalArgumentException();
	}

	public Boolean isPerfectNumber() {
		sum = 0;
		Boolean result = false;

		for (Integer i : factorArray) {
			if (number != i)
				sum += i;
		}

		if (number == sum)
			result = true;

		return result;
	}

	public void printPerfectNumberList(int limit) {

		for (int i = 1; i <= limit; i++) {

			PerfectNumber tempNumber = new PerfectNumber(i);
			if (tempNumber.isPerfectNumber())
				System.out.print(i + ",");
		}
	}

	@Override
	public String toString() {
		return "PerfectNumber [number=" + number + ", sum=" + sum + ", factorArray=" + factorArray + "]";
	}

}
