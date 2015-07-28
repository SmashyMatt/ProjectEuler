package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import eulerUtilities.EulerUtilityLeaf;

public class EulerProblem018 {
	static File file = new File("./datafiles/problem18.txt");
	static Scanner scan = null;
	static ArrayList<Integer> inputArray = new ArrayList<Integer>();
	static EulerUtilityLeaf topLeaf = null;

	public static int answer() {
		buildSet();
		topLeaf = new EulerUtilityLeaf().CreateTopLeaf(inputArray);
		return topLeaf.MaxValue();
	}

	private static ArrayList<Integer> buildSet() {
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
		}

		while (scan.hasNextInt()) {
			inputArray.add(scan.nextInt());
		}

		return inputArray;
	}

}
