package test;

import app.Calc;
import app.DateTool;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Date;

public class CalcTest {

  int a=8;
  int b=4;
  int c=0;


  @Test
  public void calcTest(){
    Assert.assertEquals(12, Calc.addNumbers(a,b));
    Assert.assertEquals(4, Calc.subtract(a,b));
    Assert.assertEquals(2, Calc.div(a,b));
    Assert.assertEquals(32, Calc.mul(a,b));
    Assert.assertEquals(-1, Calc.div(a,c));

  }

  @Test
  public void negativeCalcTest(){
    Assert.assertNotEquals(11, Calc.addNumbers(a,b));
    Assert.assertNotEquals(8, Calc.subtract(a,b));
    Assert.assertNotEquals(3, Calc.div(a,b));
    Assert.assertNotEquals(30, Calc.mul(a,b));
    Assert.assertNotEquals(0, Calc.div(a,c));
  }

  @Test
  public void  dormatDateTest (){
    Date resultDate;

    resultDate = DateTool.addHoursToNow(1);
    System.out.println(resultDate);

    resultDate = DateTool.addMinuteToNow(5);
    System.out.println(resultDate);

    resultDate = DateTool.addDayToNow(30);
    System.out.println(resultDate);
  }
}
