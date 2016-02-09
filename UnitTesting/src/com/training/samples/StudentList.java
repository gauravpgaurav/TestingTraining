package com.training.samples;

import java.util.*;

public class StudentList {

	Set<String> names;
	public StudentList()
	{
		names = new HashSet<String>();
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ramesh");
	}
	
	public Set<String> getNames(){
		
		return names;
	}
}
