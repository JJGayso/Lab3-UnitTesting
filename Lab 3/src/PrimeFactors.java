import java.util.ArrayList;
import java.util.List;


public class PrimeFactors {

	public static List<Integer> generate(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (;i % 2 == 0; i /= 2) {
			primes.add(2);
		}
		if (i > 1) {
			primes.add(i);
		}
		return primes;
	}

}
