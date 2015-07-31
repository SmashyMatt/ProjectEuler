package euler;

public class EulerProblem006 {
	/*
	 * problem details - https://projecteuler.net/problem=6
	 * 
	 * This problem seems relatively straightforward to me, perhaps the
	 * issue is closely reading the problem to ensure there's no mix-up in
	 * two similar values as you work through the loop.
	 */

	public static int answer() {
		int targetNumber = 100;
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int finalAnswer = 0;

		for (int naturalNumber = 1; naturalNumber <= targetNumber; naturalNumber++) {
			squareOfSum += naturalNumber; //to be squared later
			sumOfSquares += (naturalNumber * naturalNumber);
		}

		squareOfSum *= squareOfSum;
		finalAnswer = squareOfSum - sumOfSquares;

		return finalAnswer;

	}
}
