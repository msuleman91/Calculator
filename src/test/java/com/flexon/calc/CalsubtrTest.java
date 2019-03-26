package com.flexon.calc;



import org.junit.Test;

public class CalsubtrTest {
	
	public class CalculatorTest {
		/**
		 * Rigorous Test :-)
		 */
		
		@Test
		public void testsubtract() {
			int a = 10;
			int b = 10;
			int resultShould = 0;

			int result = Calculator.subtract(a, b);

			extracted(resultShould, result);

		
			extracted(0, Calculator.subtract(10,10));
			extracted(-10, Calculator.subtract(10,10));
			extracted(0, Calculator.subtract(0,0));
			

		}

		private void extracted(double resultShould, double result) {
			extracted(resultShould, result);
		}


}
}
