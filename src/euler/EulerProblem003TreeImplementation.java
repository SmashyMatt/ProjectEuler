package euler;

import java.math.BigInteger;

import eulerUtilities.FactoringTree;

public class EulerProblem003TreeImplementation {
	/* Problem details - https://projecteuler.net/problem=3
	 * This is an alternate implementation of Problem 3. The goal is to create a
	 * tree structure that handles the factoring and also keeps an entire
	 * history of the factors
	 */
	private static FactoringTree factoringRootNode;
	private static BigInteger factoringTargetValue = BigInteger.valueOf(600851475143L);

	public static long answer() {

		factoringRootNode = new FactoringTree(factoringTargetValue);

		return factoringRootNode.getLargestFactor().longValue();
	}

	public static String getFactorList() {

		return factoringRootNode.toString();
	}

}
