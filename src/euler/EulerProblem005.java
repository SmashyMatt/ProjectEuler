package euler;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

import eulerUtilities.FactoringTree;

public class EulerProblem005 {

	public static String answer() {
		/*
		 * problem details - https://projecteuler.net/problem=5
		 * 
		 * The use of BigIntegers is dramatically overpowered here. But knowing
		 * how Project Euler problems go I expect I'll find some use for the
		 * FactoringTree handling large values. Since it's effective and still
		 * very speedy at this scope I'll use the BigInteger implementation
		 * as-is.
		 */

		List<BigInteger> factorList = new LinkedList<BigInteger>();

		for (int i = 1; i <= 20; i++) {
			factorList.add(BigInteger.valueOf(i));
		}

		FactoringTree factoringTree = new FactoringTree(factorList);
		return factoringTree.getLowestCommonMultiple().toString();
	}

}
