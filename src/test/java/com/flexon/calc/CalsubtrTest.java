package com.flexon.calc;



import org.junit.Test;

public class CalsubtrTest {
	
	public class CalculatorTest {
		/**
		 * Rigorous Test :-)
		 */
		
		@Test
		public void testsubtract() {
			double a = 10;
			double b = 10;
			double resultShould = 0.0;

			double result = Calculator.subtract(a, b);

			extracted(resultShould, result);

		
			extracted(0, Calculator.subtract(10.0,10.0));
			extracted(-10, Calculator.subtract(10.0,10.0));
			extracted(0, Calculator.subtract(0,0));
			

		}

		private void extracted(double resultShould, double result) {
			extracted(resultShould, result);
		}


}
}
