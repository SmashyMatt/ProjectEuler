package euler;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

import eulerUtilities.FactoringTree;

public class EulerProblem005 {

	public static String answer() {
		// problem details - https://projecteuler.net/problem=5

		List<BigInteger> factorList = new LinkedList<BigInteger>();

		for (int i = 1; i <= 20; i++) {
			factorList.add(BigInteger.valueOf(i));
		}
		
		FactoringTree factoringTree = new FactoringTree(factorList);
		System.out.println(factoringTree.toString());
		return factoringTree.getLowestCommonMultiple().toString();
	}

}
