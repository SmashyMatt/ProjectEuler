package euler;
import eulerUtilities.EulerUtilities;

public class EulerProblem007 {

	public static int answer(){
		EulerUtilities myUtilityBelt = new EulerUtilities();
		int output = 0;
		int primesFound = 0;
		int targetPrime = 10001;
		
		for (int i=2; primesFound<targetPrime; i++){
			
			if (myUtilityBelt.isPrime(i)){
				primesFound++;
				if (primesFound==targetPrime){
					output = i;
				}
			}
		}
		return output;
	}
}
