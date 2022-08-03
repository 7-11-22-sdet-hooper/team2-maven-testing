import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTesting {
	@Test
	public void shouldAddTwoNumbers() {
		Assert.assertEquals(2+2, 4);
	}
	
}
