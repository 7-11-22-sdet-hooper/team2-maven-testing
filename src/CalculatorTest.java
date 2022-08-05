import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import exceptions.InvalidDivisionException;

public class CalculatorTest {
	private Calculator calculator;

	@BeforeMethod
	public void createCalculator() {
		calculator = new Calculator();
	}

	@Test
	public void shouldAddTwoNumbers() {	
		Assert.assertEquals(calculator.add(2, 3), 5);
	}

	@Test
	public void shouldSubtractTwoNumbers() {
		Assert.assertEquals(calculator.subtract(5, 1), 4);
	}

	@Test
	public void shouldMultiplyTwoNumbers() {
		Assert.assertEquals(calculator.multiply(4, 5), 20);
	}

	@Test
	public void shouldDivideTwoNumbers() throws Exception {
		Assert.assertEquals(calculator.divide(15, 5), 3);
	}

	@Test
	public void shouldThrowsInvalidDivisionException() {
		Assert.assertThrows(InvalidDivisionException.class, () -> {
			calculator.divide(8, 0);
		});
	}
}
