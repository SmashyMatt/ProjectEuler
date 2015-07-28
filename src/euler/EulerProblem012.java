package euler;

public class EulerProblem012 {

	public static int answer() {
		int testNumber = 0;
		int divisors = 0;

		ThisProcess: 
		for (int testIndex = 1; true; testIndex++) {
			testNumber += testIndex;
			
			divisors = 0;

			for (int potentialDivisors = 1; potentialDivisors < (Math.round(Math.sqrt(testNumber))); potentialDivisors++) {

				if (testNumber % potentialDivisors == 0) {
					divisors += 2;
				}

				if (divisors > 500) {
					break ThisProcess;
				}
			}
		}
		return testNumber;
	}

}
