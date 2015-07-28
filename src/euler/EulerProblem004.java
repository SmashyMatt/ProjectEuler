package euler;

import eulerUtilities.EulerUtilities;

public class EulerProblem004 {

	public static int answer() { 
		// problem details - https://projecteuler.net/problem=4
		int firstMultiple = 999;
		int secondMultiple = 999;
		int valueToTest = 0;
		int output = 0;

		/*
		 * This is a brute force method to test every possible multiple of two
		 * three digit numbers and find the largest multiple, this isn't too
		 * slow at this scale but this is not ideal. See the other
		 * implementation of problem 4 for an alternate approach.
		 */

		while (firstMultiple >= 99 && secondMultiple >= 99) {

			valueToTest = firstMultiple * secondMultiple;

			if (EulerUtilities.isPalindrome(valueToTest) && valueToTest > output) {
				output = firstMultiple * secondMultiple;
			}

			if (firstMultiple > 99) {
				firstMultiple--;
			} else {
				secondMultiple--;
				firstMultiple = secondMultiple;
			}

		}
		return output;
	}
}
