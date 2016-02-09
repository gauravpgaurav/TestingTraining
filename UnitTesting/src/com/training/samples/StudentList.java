package com.training.samples;

import java.util.*;

import com.training.samples.domain.Student;

public class StudentList {

	private Set<String> names;
	private Set<Student> list;

	public StudentList() {

		names = new HashSet<String>();

		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ramesh");
	}

	public Set<String> getNames() {
		return names;
	}

	public void setNames(Set<String> names) {
		this.names = names;
	}

	public Set<Student> getList() {
		return list;
	}

	public void setList(Set<Student> list) {
		this.list = list;
	}

}
