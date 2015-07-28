package euler;
import eulerUtilities.EulerUtilities;

public class EulerProblem010 {
	
	public static long answer(){
		EulerUtilities myUtilityBelt = new EulerUtilities();
		long output = 0;
		
		for (int i=1; i<=2000000; i++){
			if(myUtilityBelt.isPrime(i)){
				output += i;
			}
		}
		return output;
	}
}
