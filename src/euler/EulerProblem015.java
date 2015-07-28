package euler;

import java.math.BigInteger;

public class EulerProblem015 {
  static BigInteger[][] gridPoint = new BigInteger[21][21];

  public static BigInteger answer() {

    for (int i = 0; i < gridPoint.length; i++) {
      gridPoint[20][i] = BigInteger.ONE;
      gridPoint[i][20] = BigInteger.ONE;
    }
    return getPointValue(0, 0);
  }

  public static BigInteger getPointValue(int row, int column){
    if(gridPoint[row][column]==null){
      gridPoint[row][column] = getPointValue((row+1),column).add(getPointValue(row,(column+1)));
    }
    return gridPoint[row][column];
  }
    
}
