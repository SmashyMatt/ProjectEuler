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
			System.out.println("error with file");
		}
		int testValue = 1;
		int[] testGroup = new int[5];
		int outputValue = 0;
		int fiveValuesToTest = 0;
		
		while (fileScanner.hasNextInt()){
			//potential regex (\b\d){1}((\B\d){1}){1,}
			
			testGroup[fiveValuesToTest] = fileScanner.nextInt();
	
			if (fiveValuesToTest < 4){
				fiveValuesToTest++;
			} else {
				fiveValuesToTest = 0;
			}

			
			for(int i = 0; i<=4; i++){
				testValue *= testGroup[i];
			}
			
			if (testValue > outputValue){
				outputValue = testValue;
			}
			testValue = 1;
			
		}
		
		return outputValue;
	}
}
