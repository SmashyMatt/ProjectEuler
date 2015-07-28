package euler;

public class EulerProblem003 {

	public static long answer() {  
		//problem details - https://projecteuler.net/problem=3
		
		int potentialFactor = 2;  					//starting point for factoring
		long numberToBeFactored = 600851475143L;  	//as defined in problem details

		while (potentialFactor != numberToBeFactored) {
			if (numberToBeFactored % potentialFactor == 0) {
				numberToBeFactored = (numberToBeFactored / potentialFactor);
				potentialFactor = 2; 	//reset potentialFactor if a factor is identified
			} else {
				potentialFactor += 1;
			}
		}

		return numberToBeFactored; //what's left over is the largest factor
	}
}
