package euler;

public class EulerProblem002 {
	/*
	 * problem details - https://projecteuler.net/problem=2
	 * 
	 * A fun problem just to keep track of where the variables are as you
	 * plan out your loop. I'll have to make a list of these values and see
	 * if there's an interesting way to arrive at this answer beyond just
	 * testing them all.
	 */

	public static int answer() {
		int lowFibonacciValue = 0;
		int highFibonacciValue = 1;
		int totalValueOfEvenNumbers = 0;

		while (highFibonacciValue <= 4000000) {
			if (lowFibonacciValue % 2 == 0) {
				totalValueOfEvenNumbers += lowFibonacciValue;
			}

			if (highFibonacciValue % 2 == 0) {
				totalValueOfEvenNumbers += highFibonacciValue;
			}

			lowFibonacciValue += highFibonacciValue;
			highFibonacciValue += lowFibonacciValue;
			/*
			 * these two lines move us to the next two values in the sequence so
			 * we're always testing two new values per loop.
			 */
		}

		return totalValueOfEvenNumbers;

	}

}
