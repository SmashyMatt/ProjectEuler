package eulerUtilities;

import java.lang.Math;
import java.util.ArrayList;

public class EulerUtilities {
	static ArrayList<Integer> listOfPrimes = new ArrayList<Integer>();

	public static boolean isPalindrome(int testNum) {
		int tNum = testNum;
		int evalNum1 = testNum;
		int evalNum2 = 0;

		while (evalNum1 > 0) {
			evalNum2 *= 10;
			evalNum2 += evalNum1 % 10;
			evalNum1 /= 10;
		}

		if (tNum == evalNum2) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isPrime(int numberToTest) {
		int testNumber = numberToTest;
		int squareRootOfTestNumber = (int) (Math.round(Math.sqrt(testNumber)) + 1);

		if (testNumber == 1) {
			return false;
		} else if (testNumber == 2 || testNumber == 3) {
			return true;

		}

		if (listOfPrimes.size() == 0) {
			listOfPrimes.add(2);
			listOfPrimes.add(3);
		}

		if (listOfPrimes.get(listOfPrimes.size() - 1) < squareRootOfTestNumber) {
			for (int i = (listOfPrimes.get(listOfPrimes.size() - 1) + 1); i <= squareRootOfTestNumber; i++) {
				if (isPrime(i)) {
					listOfPrimes.add(i);
				}
			}
		}

		for (int i = 0; i < listOfPrimes.size()
				&& listOfPrimes.get(i) <= squareRootOfTestNumber; i++) {
			if (testNumber % listOfPrimes.get(i) == 0) {
				return false;
			}
		}
		listOfPrimes.add(testNumber);
		return true;
	}
}
