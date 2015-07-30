package eulerUtilities;

import java.util.BitSet;

public class SieveOfEratosthenes {
	private static SieveOfEratosthenes sieve;
	private static final int MAX_PRIME = 999999;
	private static BitSet primeSet = new BitSet(MAX_PRIME + 1);

	private SieveOfEratosthenes() {
		primeSet.set(2,MAX_PRIME+1);

		for (int currentPrime = primeSet.nextSetBit(0); currentPrime != -1; currentPrime = primeSet.nextSetBit(currentPrime + 1)) {

			for (int j = 2; (j * currentPrime) <= MAX_PRIME; j++) {
				primeSet.clear(j * currentPrime);
			}
		}
	}

	public static synchronized SieveOfEratosthenes getSieve() {
		if (sieve == null) {
			sieve = new SieveOfEratosthenes();
		}
		return sieve;

	}

}
