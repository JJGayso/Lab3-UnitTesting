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
	
	public static List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
	
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
				{1, list()},
				{2, list()},
				{5, list(2, 3)},
				{6, list(2, 3, 5)},
				{13, list(2, 3, 5, 7, 11)},
				{21, list(2, 3, 5, 7, 11, 13, 17, 19)},
				{100, list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)}
		});
	}
	
	@Test
	public void testPrimeNumberGeneration() {
		assertEquals(expectedResult, primeNumbers.generate(inputNumber));
	}

}
