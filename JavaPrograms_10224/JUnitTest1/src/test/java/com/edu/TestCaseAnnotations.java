package com.edu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCaseAnnotations {
	
	@BeforeClass
	public static void beforeAllTest() {
		System.out.println("Will Execute only once before all test cases");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before each Test case");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@After
	public void afterTest() {
		System.out.println("After each Test case");
	}

	@AfterClass
	public static void afterAllTest() {
		System.out.println("Will Execute only once after all test cases are done");
	}
}
