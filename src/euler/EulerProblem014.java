package euler;

import java.util.*;

public class EulerProblem014 {
	static Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();

	public static int answer() {
		int testValue = 0;
		int chainLength = 0;
		int output = 0;
		numberMap.put((int)1, (int)1);

		for (int testIndex = 1; testIndex < 1000000; testIndex++) {
			testValue = testIndex;

			for (chainLength = 0; testValue > 1; chainLength++) {
				if (!numberMap.containsKey(testValue)) {

					if (testValue % 2 == 0) {
						testValue /= 2;
					} else {
						testValue = (testValue * 3) + 1;
					}

				} else {
					chainLength = chainLength + (numberMap.get(testValue));
					numberMap.put(testIndex, chainLength);
					if (numberMap.get(testIndex) > output) {
						output = testIndex;
					}
				}
			}
		}
		return output;
	}
}
