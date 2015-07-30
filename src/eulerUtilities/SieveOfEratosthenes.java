package eulerUtilities;

import java.util.BitSet;

public class SieveOfEratosthenes {
	private static SieveOfEratosthenes sieve;
	private static int maxPrimeValue = 999999;
	private static BitSet setOfDiscoveredPrimes = new BitSet(maxPrimeValue);

	private SieveOfEratosthenes() {
		for (int i = 2; i <= maxPrimeValue; i++) {
			setOfDiscoveredPrimes.set(i);
		}

		for (int currentPrime = setOfDiscoveredPrimes
				.nextSetBit(0); currentPrime != -1; currentPrime = setOfDiscoveredPrimes.nextSetBit(currentPrime + 1)) {

			BitSet nonPrimeNumbers = new BitSet(maxPrimeValue);

			int currentMultiple = 0;
			for (int j = 2; currentMultiple <= maxPrimeValue; j++) {
				currentMultiple = (j * currentPrime);
				nonPrimeNumbers.set(currentMultiple);
			}
			setOfDiscoveredPrimes.andNot(nonPrimeNumbers);
		}

	}

	public static SieveOfEratosthenes SieveOfEratosthenes() {
		if (sieve == null) {
			sieve = new SieveOfEratosthenes();
		}
		return sieve;

	}

	public String toString() {
		return setOfDiscoveredPrimes.toString();
	}

}
