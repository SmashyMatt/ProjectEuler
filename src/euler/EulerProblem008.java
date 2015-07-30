package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EulerProblem008 {
	private static long highestScore = 0;
	private static List<Integer> highestScoringList = new ArrayList<Integer>();

	public static long answer() {
		/*
		 * problem details - https://projecteuler.net/problem=8
		 * 
		 * The scope of this problem changed from the time when I originally
		 * completed it. Now the solution requires you multiply 13 digits rather
		 * than 5. This adds a bit more of a desire to do the calculations
		 * programmatically and has a hidden trick. It turns out some of your
		 * highest sets will exceed the maximum value for int and overflow so
		 * you actually don't get the correct answer if your score tracking
		 * variable is an int. This is the first problem that requires some form
		 * of reading from file, which I rarely use.
		 */
		File inputFile = new File("./datafiles/problem08.txt");
		Scanner fileScanner = null;
		List<Integer> listOfIntegersFromFile = new ArrayList<Integer>();
		List<Integer> listOfIntegersBeingTested = new ArrayList<Integer>();

		try {
			fileScanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			System.out.println("error with file " + inputFile.toString() + " : " + e);
		}

		for (int index = 0; fileScanner.hasNext(); index++) {
			Integer integerFromFile = Integer.valueOf(fileScanner.findWithinHorizon("\\d", 1000));
			listOfIntegersFromFile.add(index, integerFromFile);

		}

		for (int index = 0; index < 1000; index++) {
			long testScore = 1;
			if (listOfIntegersBeingTested.size() < 13) {
				listOfIntegersBeingTested.add(index, listOfIntegersFromFile.get(index));
			} else {
				listOfIntegersBeingTested.remove(0);
				listOfIntegersBeingTested.add(12, listOfIntegersFromFile.get(index));

			}
			for (Integer integer : listOfIntegersBeingTested) {
				testScore *= integer;
			}
			// System.out.println(listOfIntegersBeingTested.toString() + " : " + testScore);
			// ^ fun to watch the list build and change

			if (testScore > highestScore) {
				highestScore = testScore;
				highestScoringList.clear();
				highestScoringList.addAll(listOfIntegersBeingTested);
			}

		}
		return highestScore;
	}

	public List<Integer> getHighScoringList() {
		return highestScoringList;
	}

}
