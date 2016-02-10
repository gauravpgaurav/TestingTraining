package com.training.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class MyTestRunner {

	public static void main(String[] args){
		Result result = JUnitCore.runClasses(MyTestSuite.class);
		
		
	}
}
