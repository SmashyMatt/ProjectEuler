package euler;
import java.math.BigInteger;

public class EulerProblem016 {
  static BigInteger ridiNum = new BigInteger("2");
  static String ridiString = null;
  static char[] ridiCharArray = null;
  static int output = 0;
  
  public static int answer(){
    ridiNum = ridiNum.pow(1000);
    ridiString = ridiNum.toString();
    ridiCharArray = ridiString.toCharArray();
    
    for(int i=0; i < ridiCharArray.length; i++){
      output += Character.getNumericValue(ridiCharArray[i]);
    }
    
    return output;
  }

}
