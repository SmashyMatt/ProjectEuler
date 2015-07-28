package euler;

public class EulerProblem002 {

	public static int answer() { 
		//problem details - https://projecteuler.net/problem=2
		int lowFibonacciValue = 0;
		int highFibonacciValue = 1;
		int totalValueOfEvenNumbers = 0;

		while (highFibonacciValue <= 4000000) {
			if (lowFibonacciValue % 2 == 0) {
				totalValueOfEvenNumbers += lowFibonacciValue;
			}

			if (highFibonacciValue % 2 == 0) {
				totalValueOfEvenNumbers += highFibonacciValue;
			}

			lowFibonacciValue += highFibonacciValue;  //these two lines move us to the next
			highFibonacciValue += lowFibonacciValue;  //two values in the sequence 
		}

		return totalValueOfEvenNumbers;

	}

}
