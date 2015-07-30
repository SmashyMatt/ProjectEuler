package eulerUtilities;

import java.util.BitSet;

public class SieveOfEratosthenes {
	private static SieveOfEratosthenes sieve;
	private static final int MAX_PRIME = 9999999;
	private static BitSet primeSet = new BitSet(MAX_PRIME + 1);

	private SieveOfEratosthenes() {
		primeSet.set(2, MAX_PRIME + 1);

		for (int currentPrime = primeSet.nextSetBit(0); currentPrime != -1; currentPrime = primeSet.nextSetBit(currentPrime + 1)) {
			for (int j = 2; (j * currentPrime) <= MAX_PRIME; j++) {
				primeSet.clear(j * currentPrime);
			}
		}
	}

	/**
	 * Returns a reference to a singleton instance of the Sieve. Currently the
	 * Sieve has a calculated list of all primes less than ten million.
	 * 
	 * @return
	 */
	public static synchronized SieveOfEratosthenes getSieve() {
		if (sieve == null) {
			sieve = new SieveOfEratosthenes();
		}
		return sieve;
	}

	/**
	 * Returns an integer that is a prime number greater than the integer
	 * provided. Will return -1 if there are no primes calculated that are
	 * greater than the provided integer. The Sieve currently calculates all
	 * primes less than ten million.
	 * 
	 * @param integer
	 * @return
	 */
	public static int getNextPrimeAfter(int integer) {
		return primeSet.nextSetBit(integer + 1);
	}

	/**
	 * Returns the largest prime number calculated by the Sieve, currently the
	 * Sieve calculates all prime values less than ten million.
	 * 
	 * @return
	 */
	public static int getLargestPrime() {
		return primeSet.previousSetBit(primeSet.length());
	}

}
