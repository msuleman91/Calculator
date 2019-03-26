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

		assertEquals(100, Calculator.sum(10, 10));
		assertEquals(0, Calculator.sum(0, 10));
		assertEquals(0, Calculator.sum(0, 0));

	}
}
