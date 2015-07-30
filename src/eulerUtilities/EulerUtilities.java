package eulerUtilities;

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

}
