import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

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
	
	public PrimeNumberGeneratorTest (Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection producePrimeNumers() {
		return Arrays.asList(new Object[][] {
				{2}
		}
	}

}
