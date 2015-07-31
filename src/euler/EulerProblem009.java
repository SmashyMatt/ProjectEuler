package euler;

public class EulerProblem009 {
	/*
	 * problem details - https://projecteuler.net/problem=9
	 * 
	 * This might work but man is this ugly, problem 9 in progress!
	 * 
	 */

	
	public static int answer(){

		int a = 0;
		int b = 0;
		int c = 0;
		
		for(a=1; a<1000; a++){
			b = a+1;
			c = (1000 - a - b);
			while (b<c){
				if ((a*a)+(b*b)==(c*c)){
					return (a*b*c);
				}else{
					c--;
					b++;
				}
			}
						
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		return (a*b*c);
	}
}
