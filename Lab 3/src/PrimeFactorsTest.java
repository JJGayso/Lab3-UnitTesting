import static org.junit.Assert.*;

import org.junit.Test;


public class PrimeFactorsTest {

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactors.generate(1));
	}

}
