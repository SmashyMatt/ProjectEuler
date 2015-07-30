package eulerUtilities;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class FactoringTree {
	private BigInteger nodeValue;
	private FactoringTree leftChild = null;
	private FactoringTree rightChild = null;

	/**
	 * Accepts a BigInteger value to create a factor tree. The tree structure
	 * will self-populate and return once factoring is completed.
	 * 
	 * getLargestFactor(), getFactorList(), getLowestCommonMultiple() may then
	 * be called to get desired info.
	 * 
	 * @param factorTarget
	 */
	public FactoringTree(BigInteger factorTarget) {
		nodeValue = factorTarget;
		BigInteger factor = findFactor(factorTarget);

		if (factor.compareTo(nodeValue) == -1) {
			leftChild = new FactoringTree(factor);
			rightChild = new FactoringTree(factorTarget.divide(factor));
		}

		return;
	}

	/**
	 * Accepts a list of BigIntegers to begin creating a factoring tree which
	 * will contain a combined set of all factors for all the numbers in the
	 * provided list.
	 * 
	 * Example, if the List provided contains the values 2,3,4,5,6 the resulting
	 * tree would contain the factors 2,2,3,5
	 * 
	 * The tree structure will self-populate and return once factoring is
	 * completed.
	 * 
	 * getLargestFactor(), getFactorList(), getLowestCommonMultiple() may then
	 * be called to get desired info.
	 * 
	 * @param factorTargetList
	 * @return
	 */
	public FactoringTree(List<BigInteger> factorTargetList) {
		nodeValue = BigInteger.ONE;
		leftChild = new FactoringTree(BigInteger.ONE);
		rightChild = new FactoringTree(BigInteger.ONE);

		for (BigInteger factorTarget : factorTargetList) {
			rightChild = rightChild.reOrganizeNodes(factorTarget);
			if (rightChild != null) {
				nodeValue = rightChild.getNodeValue();
			}
		}
	}

	private FactoringTree reOrganizeNodes(BigInteger factorTarget) {

		if (factorTarget.compareTo(BigInteger.ONE) != 0
				|| (rightChild != null && factorTarget.compareTo(rightChild.getNodeValue()) == 0)) {

			if (leftChild != null && factorTarget.mod(leftChild.getNodeValue()) == BigInteger.ZERO) {
				factorTarget = factorTarget.divide(leftChild.getNodeValue());
			}

			if (rightChild == null) {
				return new FactoringTree(factorTarget.multiply(nodeValue));
			}
			
			if (factorTarget.compareTo(leftChild.getNodeValue()) == -1){
				return new FactoringTree(factorTarget.multiply(nodeValue));
			}

			if (rightChild != null) {
				rightChild = rightChild.reOrganizeNodes(factorTarget);
				nodeValue = leftChild.getNodeValue().multiply(rightChild.getNodeValue());
				return this;
			}

		}

		return this;

	}

	private BigInteger findFactor(BigInteger factorTarget) {
		for (BigInteger factor = BigInteger.valueOf(2); factor.compareTo(factorTarget) == -1; factor = factor
				.add(BigInteger.ONE)) {
			if (factorTarget.mod(factor).compareTo(BigInteger.ZERO) == 0) {
				return factor;
			}
		}
		return factorTarget;
	}

	/**
	 * Returns a List of Integer objects for all the factors in the tree
	 * structure.
	 * 
	 * @return
	 */
	public List<BigInteger> getFactorList() {
		List<BigInteger> factorList = new LinkedList<BigInteger>();

		if (leftChild == null && rightChild == null) {
			factorList.add(nodeValue);
		}

		if (leftChild != null && leftChild.getNodeValue() != BigInteger.ONE) {
			factorList.addAll(leftChild.getFactorList());
		}

		if (rightChild != null) {
			factorList.addAll(rightChild.getFactorList());
		}

		return factorList;

	}

	/**
	 * Returns a long of the largest factor within the tree structure.
	 * 
	 * @return
	 */
	public BigInteger getLargestFactor() {
		if (rightChild == null && leftChild != null) {
			return leftChild.getLargestFactor();
		} else if (leftChild == null && rightChild == null) {
			return nodeValue;
		} else {
			return rightChild.getLargestFactor();
		}
	}

	/**
	 * Returns a String of all factors within the tree structure.
	 * 
	 * @return
	 */
	public String toString() {

		if (leftChild != null && leftChild.getNodeValue() == BigInteger.ONE) {
			if (rightChild != null) {
				return rightChild.toString();
			} else {
				return String.valueOf(nodeValue);
			}
		}

		if (leftChild != null && rightChild != null) {
			return leftChild.toString() + ", " + rightChild.toString();
		} else {
			return String.valueOf(nodeValue);
		}

	}

	private BigInteger getNodeValue() {
		return nodeValue;
	}

	public BigInteger getLowestCommonMultiple() {
		return nodeValue;
	}

}
