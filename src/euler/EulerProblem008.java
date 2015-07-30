package euler;
import java.util.Scanner;
import java.io.*;

public class EulerProblem008 {

	public static int answer() {
		File inputFile = new File("./datafiles/problem08.txt");
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			System.out.println("error with file "+ inputFile.toString());
		}
		int testValue = 1;
		int[] testGroup = new int[13];
		int outputValue = 0;
		int fiveValuesToTest = 0;
		
		while (fileScanner.hasNextInt()){
			
			testGroup[fiveValuesToTest] = fileScanner.nextInt();

		}
		return outputValue;
	}
}
