package euler;

import eulerUtilities.SieveOfEratosthenes;

public class EulerMain {
	static long timerStart = 0;
	static long timerEnd = 0;
	static long timeSpent = 0;
	static SieveOfEratosthenes sieve = SieveOfEratosthenes.getSieve();

	public static void main(String[] args) {
		timerStart = System.currentTimeMillis();
		System.out.println("Problem 1 Answer is : " + EulerProblem001.answer() + " which took "	+ timeTaken() + " milliseconds");
		System.out.println("Problem 2 Answer is : " + EulerProblem002.answer() + " which took "	+ timeTaken() + " milliseconds");
		System.out.println("Problem 3 Answer is : " + EulerProblem003.answer() + " which took " + timeTaken() + " milliseconds");
		System.out.println(" -Tree Implementation Answer is : " + EulerProblem003TreeImplementation.answer() + " which took " + timeTaken() + " milliseconds \n -List of Factors : " + EulerProblem003TreeImplementation.getFactorList());
		System.out.println("Problem 4 - " + EulerProblem004.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println(" -Alternate Implementation Answer is : " + EulerProblem004Alternate.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 5 - " + EulerProblem005.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 6 - " + EulerProblem006.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 7 - " + EulerProblem007.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 8 - " + EulerProblem008.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 9 - " + EulerProblem009.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 10 - " + EulerProblem010.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 11 - " + EulerProblem011.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 12 - " + EulerProblem012.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 13 - " + EulerProblem013.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 14 - " + EulerProblem014.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 15 - " + EulerProblem015.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 16 - " + EulerProblem016.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 17 - " + EulerProblem017.answer() + " took " + timeTaken() + " milliseconds");
		System.out.println("Problem 18 - " + EulerProblem018.answer() + " took " + timeTaken() + " milliseconds");
		//System.out.println("Problem 19 - " + EulerProblem019.answer() + " took " + timeTaken() + " milliseconds");
		// System.out.println("Problem 20 - " + EulerProblem020.answer() + " took "+ timeTaken() + " milliseconds");
		System.out.println("Problem 67 - " + EulerProblem067.answer() + " took " + timeTaken() + " milliseconds");
	}

	public static long timeTaken() {
		timerEnd = System.currentTimeMillis();
		timeSpent = timerEnd - timerStart;
		timerStart = System.currentTimeMillis();
		return timeSpent;

	}

	public static void stuff() {
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				System.out.println("Hi I'm j " + j + " and I'm i " + i);
			}
		}
	}

}
