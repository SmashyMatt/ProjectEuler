package euler;

public class EulerProblem006 {

	
	public static int answer(){
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int output = 0;
		
		for (int i=1; i<=100; i++){
			squareOfSum += i;
			sumOfSquares += (i*i);
		}
		
		squareOfSum *= squareOfSum;
		output = squareOfSum - sumOfSquares;
		
		return output;
		
	}
}
