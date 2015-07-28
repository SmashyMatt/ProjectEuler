package euler;

public class EulerProblem001 {

	public static int answer() { 
		// problem details - https://projecteuler.net/problem=1
		int sumOfMultiples = 0;

		for (int i = 0; i < 1000; i++) { 	// for all values <1000
			if (i % 3 == 0 || i % 5 == 0) { // check if multiple of 3 or 5
				sumOfMultiples += i; 		// if so add to running total
			}
		}
		return sumOfMultiples;
	}
}
