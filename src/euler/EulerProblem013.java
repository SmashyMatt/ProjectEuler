package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;

public class EulerProblem013 {
	static File file = new File("./datafiles/problem13.txt");
	static Scanner scan = null;
	static BigInteger[] bigIntArray = new BigInteger[100];

	public static BigInteger answer(){
		buildSet();
		
		for(int i=1; i<bigIntArray.length; i++){
			bigIntArray[0] = bigIntArray[0].add(bigIntArray[i]);
			//System.out.println(i);
			//System.out.println(bigIntArray.length);
		}
		
		return bigIntArray[0];
	}
		
	private static BigInteger[] buildSet(){
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {}
		
		for(int i=0; (scan.hasNextBigInteger()); i++){
			BigInteger x = scan.nextBigInteger();
			bigIntArray[i] = x;
		}
		
		return bigIntArray;
	}
	
}
