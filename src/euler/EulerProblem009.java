package euler;

public class EulerProblem009 {

	
	public static int answer(){
		int a = 0;
		int b = 0;
		int c = 0;
		
	search:
		for(a=1; a<333; a++){
			b = a+1;
			c = (1000 - a - b);
			while (b<c){
				if ((a*a)+(b*b)==(c*c)){
					break search;
				}else{
					c--;
					b++;
				}
			}
						
		}
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		return (a*b*c);
	}
}
