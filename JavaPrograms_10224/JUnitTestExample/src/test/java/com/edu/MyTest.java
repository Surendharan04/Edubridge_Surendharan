package com.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		int s, a, b;
		a = 6;
		b = 9;
		s = a + b;
		assertEquals(15, s);
	}
	
	@Test
	public void test1() {
		//fail("Not yet implemented");
		int s, a, b;
		a = 6;
		b = 9;
		s = a - b;
		assertEquals(-3, s);
	}

	@Test
	public void checkString() {
		String s = "hello";
		s = s.toUpperCase();
		assertEquals("HELLO", s);
	}
}
