import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class PrimeFactorsTest {
	
	private List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactors.generate(1));
	}

	@Test
	public void testTwo() throws Exception {
		assertEquals(list(2), PrimeFactors.generate(2));
	}
	
	@Test
	public void testThree() throws Exception {
		assertEquals(list(3), PrimeFactors.generate(3));
	}
	
	@Test
	public void testFour() throws Exception {
		assertEquals(list(2, 2), PrimeFactors.generate(4));
	}
	
	@Test
	public void testSix() throws Exception {
		assertEquals(list(2, 3), PrimeFactors.generate(6));
	}
	
	@Test
	public void testEight() throws Exception {
		assertEquals(list(2, 2, 2), PrimeFactors.generate(8));
	}
	
	@Test
	public void testNine() throws Exception {
		assertEquals(list(3, 3), PrimeFactors.generate(9));
	}
	
	@Test
	public void testBigNum() throws Exception {
		assertEquals(list(5, 7, 7, 1327), PrimeFactors.generate(325115));
	}
}
