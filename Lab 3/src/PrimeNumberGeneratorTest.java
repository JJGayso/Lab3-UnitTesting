import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;
	
	@Before
	public void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
