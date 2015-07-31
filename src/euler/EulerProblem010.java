package euler;

import eulerUtilities.SieveOfEratosthenes;

public class EulerProblem010 {
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static long answer(){
		SieveOfEratosthenes sieve = SieveOfEratosthenes.getSieve();
		long output = 0;
		
		for (int i=1; i<2000000; i=sieve.getNextPrimeAfter(i) ){
			output += i;
		}
		return output;
	}
}
