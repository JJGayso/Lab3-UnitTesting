import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {
	private Integer inputNumber;
	private List<Integer> expectedResult;
	private PrimeNumberGenerator primeNumbers;
	
	@Before
	public void initialize() {
		primeNumbers = new PrimeNumberGenerator();
	}
	
	public PrimeNumberGeneratorTest (Integer inputNumber, List<Integer> expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> producePrimeNumers() {
		return Arrays.asList(new Object[][] {
				{1, null}
		});
	}
	
	@Test
	public void testPrimeNumberGeneration() {
		assertEquals(expectedResult, primeNumbers.generate(inputNumber));
	}

}
