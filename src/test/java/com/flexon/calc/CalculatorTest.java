package com.flexon.calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class CalculatorTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void testSum() {
		int a = 10;
		int b = 10;
		int resultShould = 20;

		int result = Calculator.sum(a, b);

		assertEquals(resultShould, result);

		assertEquals(20, Calculator.sum(10, 10));
		assertEquals(10, Calculator.sum(0, 10));
		assertEquals(0, Calculator.sum(0, 0));

	}



}
