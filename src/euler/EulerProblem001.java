package euler;

public class EulerProblem001 {
	/*
	 * problem details - https://projecteuler.net/problem=1
	 * 
	 * Very straightforward problem, the biggest catch is that 3 and 5 have
	 * common multiples and so if you checked each value separately you
	 * would count all the multiples of 15 twice.
	 */

	public static int answer() {
		int sumOfMultiples = 0;

		for (int i = 0; i < 1000; i++) { 	// for all values <1000
			if (i % 3 == 0 || i % 5 == 0) { // check if multiple of 3 or 5
				sumOfMultiples += i; 		// if so add to running total
			}
		}
		return sumOfMultiples;
	}
}
