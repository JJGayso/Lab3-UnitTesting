import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberGenerator primeNumbers;
	
	@Before
	public void initialize() {
		primeNumbers = new PrimeNumberGenerator();
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
