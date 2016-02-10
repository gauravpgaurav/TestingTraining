package com.training.samples.domain;

import java.util.ArrayList;

public class PerfectNumber {

	private int number;
	private int sum;
	private ArrayList<Integer> factorArray;
	private ArrayList<Integer> perfectNumberArray;
	
	private void generateFactorArray() {

		for (int i = 1; i <= number; i++) {

			if (number % i == 0)
				factorArray.add(i);
		}
	}

//	public int getNumber() {
//		return number;
//	}
//
//	public void setNumber(int number) {
//		this.number = number;
//	}
//
//	public ArrayList<Integer> getFactorArray() {
//		return factorArray;
//	}
//
//	public void setFactorArray(ArrayList<Integer> factorArray) {
//		this.factorArray = factorArray;
//	}

	public ArrayList<Integer> getPerfectNumberArray() {
		return perfectNumberArray;
	}

	public void setPerfectNumberArray(ArrayList<Integer> perfectNumberArray) {
		this.perfectNumberArray = perfectNumberArray;
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

		perfectNumberArray = new ArrayList<>();
		for (int i = 1; i <= limit; i++) {

			PerfectNumber tempNumber = new PerfectNumber(i);
			if (tempNumber.isPerfectNumber())
				perfectNumberArray.add(i);
		}
		setPerfectNumberArray(perfectNumberArray);
		
	}

	@Override
	public String toString() {
		return "PerfectNumber [number=" + number + ", sum=" + sum + ", factorArray=" + factorArray + "]";
	}

}
