import java.util.ArrayList;
import java.util.List;


public class PrimeNumberGenerator {

	public static List<Integer>generate(Integer inputNumber) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (inputNumber == 2) {
			primes.add(1);
		}
		return primes;
	}
	
}
