package com.training.tests;

import com.training.samples.StudentList;
import com.training.samples.domain.Student;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

public class StudentListTestCase {

	StudentList list = null;

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
		// Checking if Duplicate Names
		StudentList list = new StudentList();
		int actual = list.getNames().size();
		assertEquals(2, actual);
	}

	@Test
	public void testStudentNotNull() {
		// Checking if Not Null
		StudentList list = new StudentList();
		Object obj = list.getNames();
		assertNotNull(obj);
	}

	@Test
	public void testSetAcceptDuplicate() {
		// Checking if Duplicate Student
		StudentList list = new StudentList();
		Student s1 = new Student(101, "Ramesh");
		Student s2 = new Student(101, "Ramesh");
		HashSet<Student> stud = new HashSet<Student>();
		stud.add(s1);
		stud.add(s2);
		list.setList(stud);
		int actual = list.getList().size();
		assertEquals(1, actual);
	}
}
