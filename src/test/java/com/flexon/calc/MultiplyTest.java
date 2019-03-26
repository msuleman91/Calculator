package com.flexon.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplyTest {
	
	
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void testmultiply() {
		int a = 10;
		int b = 10;
		int resultShould = 100;

		int result = Calculator.multiply(a, b);

		assertEquals(resultShould, result);

		assertEquals(100, Calculator.multiply(10, 10));
		assertEquals(0, Calculator.multiply(0, 10));
		assertEquals(0, Calculator.multiply(0, 0));

	}
}
