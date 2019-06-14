package app;

public class Calc {

  public static int addNumbers(int numOne, int numTwo){

    return numOne + numTwo;
  }

  public static int subtract (int numOne, int numTwo){

    return numOne-numTwo;
  }

  public static int div (int numOne, int numTwo){
    if (numTwo != 0) {
      return numOne / numTwo;
    }
    return -1;
  }

  public static int mul (int numOne, int numTwo){

    return numOne*numTwo;
  }

}
