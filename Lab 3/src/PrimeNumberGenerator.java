import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.List;


public class PrimeNumberGenerator {

	public static List<Integer>generate(Integer inputNumber) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int i =1;
		while (i < inputNumber) {
			if (validate(i)) {
				primes.add(i);
			}
			i++;
		}
		return primes;
	}
	
	public static Boolean validate(final Integer primeNumber) {
	      for (int i = 2; i <= (primeNumber / 2); i++) {
	         if (primeNumber % i == 0) {
	            return false;
	         }
	      }
	      return true;
	   }
	
}
