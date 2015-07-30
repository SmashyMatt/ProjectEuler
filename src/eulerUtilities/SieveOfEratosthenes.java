package eulerUtilities;

import java.util.BitSet;

public class SieveOfEratosthenes {
	private static SieveOfEratosthenes sieve;
	private static int maxPrimeValue = 999999;
	private static BitSet primeSet = new BitSet(maxPrimeValue + 1);

	private SieveOfEratosthenes() {
		primeSet.set(2,maxPrimeValue+1);

		for (int currentPrime = primeSet.nextSetBit(0); currentPrime != -1; currentPrime = primeSet.nextSetBit(currentPrime + 1)) {

			BitSet nonPrimeNumbers = new BitSet(maxPrimeValue+1);

			for (int j = 2; (j * currentPrime) <= maxPrimeValue; j++) {
				nonPrimeNumbers.set(j * currentPrime);
			}
			primeSet.andNot(nonPrimeNumbers);
		}

	}

	public static SieveOfEratosthenes SieveOfEratosthenes() {
		if (sieve == null) {
			sieve = new SieveOfEratosthenes();
		}
		return sieve;

	}

	public String toString() {
		return primeSet.toString();
	}

}
