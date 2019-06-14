package app;

import static app.Calc.*;

public class Main {
  public static void main(String[] args) {

    int a=8;
    int b=4;
    int c=0;

    System.out.println(addNumbers(a,b));
    System.out.println(subtract(a,b));
    System.out.println(div(a,b));
    System.out.println(mul(a,b));
    System.out.println(div(a,c));

  }
}
