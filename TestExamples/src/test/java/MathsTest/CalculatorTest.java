package MathsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Maths.Calculator;

public class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	public void addTest() {
		double num1 = 8;
		double num2 = 4;
		double expectedResult = 12;
		double actualResult = calculator.add(num1, num2);

		assertEquals(expectedResult, actualResult, 8);

	}

	@Test
	public void subtractTest() {
		double num1 = 100;
		double num2 = 50;
		double expectedResult = 50;
		double actualResult = calculator.subtract(num1, num2);

		assertEquals(expectedResult, actualResult, 8);

	}

	@Test
	public void divisionTest() {
		double num1 = 8;
		double num2 = 2;
		double expectedResult = 4;
		double actualResult = calculator.divide(num1, num2);

		assertEquals(expectedResult, actualResult, 8);

	}

	@Test
	public void multiplyTest() {
		double num1 = 7;
		double num2 = 5;
		double expectedResult = 35;
		double actualResult = calculator.multiply(num1, num2);

		assertEquals(expectedResult, actualResult, 8);

	}

}
