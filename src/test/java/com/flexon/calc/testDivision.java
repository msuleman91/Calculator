package com.flexon.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testDivision {
	
	
	public class DivisionTest {
		
		
		/**
		 * Rigorous Test :-)
		 */
		@Test
		public void testdivision() {
			int a = 10;
			int b = 10;
			int resultShould = 1;

			int result = Calculator.division(a, b);

			assertEquals(resultShould, result);

			assertEquals(1, Calculator.division(10, 10));
			assertEquals(0, Calculator.division(0, 10));
			assertEquals(0, Calculator.division(0, 0));

		}

}
}