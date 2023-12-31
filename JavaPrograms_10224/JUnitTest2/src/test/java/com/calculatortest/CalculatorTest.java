package com.calculatortest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.Calculator;

public class CalculatorTest {

	Calculator cal = new Calculator();
	
	@Test
	public void calculatorTestSum() {
		int sum = cal.add(22 , 5);
		assertEquals(27, sum);	
	}
	
	@Test
	public void calculatorTestSubtract() {
		int sub = cal.subtract(8 , 3);
		assertEquals(5, sub);	
	}
	
	@Test
	public void calculatorTestMultiply() {
		int mul = cal.multiply(20 , 2);
		assertEquals(40, mul);	
	}
	
	@Test//(expected = ArithmeticException.class)
	public void calculatorTestDivide() {
		int div = cal.divide(20 , 10);
		assertEquals(2, div);	
	}

}
