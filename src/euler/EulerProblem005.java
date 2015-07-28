package euler;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

import eulerUtilities.EulerFactoringTree;

public class EulerProblem005 {

	public static String answer() {
		// problem details - https://projecteuler.net/problem=5

		List<BigInteger> factorList = new LinkedList<BigInteger>();

		for (long i = 2000; i >= 1; i--) {
			factorList.add(BigInteger.valueOf(i));
		}
		EulerFactoringTree factoringTree = new EulerFactoringTree(factorList);
		System.out.println(factoringTree.toString());
		return factoringTree.getLowestCommonMultiple().toString();
	}

}
