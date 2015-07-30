package euler;

import eulerUtilities.SieveOfEratosthenes;

public class EulerProblem007 {

	public static int answer() {
		/*
		 * problem details - https://projecteuler.net/problem=7
		 * 
		 * Using the Sieve this is rather easy to do since we know about a lot
		 * of prime numbers at this point and we're simply iterating to the one
		 * we want. I had toyed with spinning up a HashMap of the values in the
		 * Sieve and just pulling the 10001st prime from the map, but creating
		 * the HashMap from the values in the Sieve takes significantly more
		 * processing time than simply iterating through the values.
		 */
		int targetPrime = 10001;
		int targetPrimeValue = 0;
		int lastPrimeFound = 1;

		for (int index = 1; index <= targetPrime; index++) {
			lastPrimeFound = SieveOfEratosthenes.getNextPrimeAfter(lastPrimeFound);
			if (index == targetPrime) {
				targetPrimeValue = lastPrimeFound;

			}
		}

		return targetPrimeValue;
	}
}
