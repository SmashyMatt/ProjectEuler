package euler;

public class EulerProblem003 {
	/*
	 * problem details - https://projecteuler.net/problem=3
	 * 
	 * This is almost exactly my original implementation for Problem3. This
	 * moves fast when considering the specific scope of the problem, but
	 * it's more interesting to imagine that you might get many requests
	 * like this with varyingly large numbers and additional information
	 * requested. Checkout 003TreeImplementation to see an alternate
	 * direction I went with this problem.
	 */

	public static long answer() {
		int potentialFactor = 2;
		long numberToBeFactored = 600851475143L;

		while (potentialFactor != numberToBeFactored) {
			if (numberToBeFactored % potentialFactor == 0) {
				numberToBeFactored = (numberToBeFactored / potentialFactor);
				potentialFactor = 2; // reset potentialFactor to start again at 2
			} else {
				potentialFactor += 1;
			}
		}
		return numberToBeFactored; // what's left over is the largest factor
	}
}
