import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	@Test
	public void shouldAddTwoNumbers() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.add(2, 2), 4);
	}
}
