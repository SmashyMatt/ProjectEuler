package euler;

import eulerUtilities.EulerUtilities;

public class EulerProblem004Alternate {
	/*
	 * problem details - https://projecteuler.net/problem=4
	 *
	 * This approach creates a lot more code, but can handle a much wider range
	 * of inputs and allows me to test out what happens when you take even
	 * larger numbers and smash them together, I might have to pull this out
	 * into a utility if another Project Euler problem wants to know about
	 * multiples of various sized digit numbers
	 */
	private static Double firstMultipleMaxValue;
	private static Double firstMultipleMinValue;
	private static Double secondMultipleMaxValue;
	private static Double secondMultipleMinValue;
	private static int productValue = 0;
	private static int testRangeMax = 0;
	private static int testRangeMin = 0;
	private static int remainderTargetLength = 0;

	public static int answer() {
		return largestPalindromeProduct(3, 3);
	}

	/**
	 * Accepts two arguments for the length of the values to be tested for,
	 * default for this problem is two three-digit numbers so the method is
	 * called with (3,3) as the parameters.
	 * 
	 * This returns an int, so the max acceptable value for both parameters when they
	 * are added together is 9. Example parameters for a three and four digit
	 * number : largetsPalindromeProduct(3,4) = 7 total and is acceptable. Will
	 * return zero if parameters are too large or unexpected errors occur.
	 * 
	 * @param firstValueLength
	 * @param secondValueLength
	 * @return
	 */
	private static int largestPalindromeProduct(int firstValueLength, int secondValueLength) {
		if (firstValueLength + secondValueLength > 9) {
			return 0;
			// return error maybe later
		}

		// setup data based on inputs
		setupPalindromeCheck(firstValueLength, secondValueLength);

		// test potential values as palindromes and then confirm
		// if they can be reached by multiplying the target value numbers.
		for (/* no init */ ; productValue > 1; productValue--) {
			if (EulerUtilities.isPalindrome(productValue)) {
				for (int currentTestValue = testRangeMax; currentTestValue > testRangeMin; currentTestValue--) {
					if (productValue % currentTestValue == 0) {
						int remainderLength = String.valueOf(productValue / currentTestValue).length();
						if (remainderLength == remainderTargetLength) {
							return productValue;
						}
					}
				}

			}
		}
		return 0;
	}

	private static void setupPalindromeCheck(int firstValueLength, int secondValueLength) {
		/*
		 * setup section to determine all the important ranges, important that
		 * we choose the best test ranges and note which range is used so that
		 * the output value can be confirmed to work with the other target
		 * number.
		 */
		firstMultipleMaxValue = Math.pow(10, firstValueLength) - 1;
		firstMultipleMinValue = Math.pow(10, (firstValueLength - 1)) - 1;
		secondMultipleMaxValue = Math.pow(10, secondValueLength) - 1;
		secondMultipleMinValue = Math.pow(10, (secondValueLength - 1)) - 1;
		productValue = (firstMultipleMaxValue.intValue()) * (secondMultipleMaxValue.intValue());
		testRangeMax = 0;
		testRangeMin = 0;
		remainderTargetLength = 0;

		if (firstMultipleMaxValue < secondMultipleMaxValue) {
			testRangeMax = firstMultipleMaxValue.intValue();
			testRangeMin = firstMultipleMinValue.intValue();
			remainderTargetLength = secondValueLength;
		} else {
			testRangeMax = secondMultipleMaxValue.intValue();
			testRangeMin = secondMultipleMinValue.intValue();
			remainderTargetLength = firstValueLength;
		}

	}
}
