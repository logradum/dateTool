package test;

import app.Calc;
import app.DateTool;
import org.jetbrains.annotations.NotNull;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcTest {

  int a=8;
  int b=4;
  int c=0;
  static  Date resultDate;


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
  public void  addingHoursTest (){
    String addedHoursToString = parseTimeToString(getAddedHoursDate(1));
    /*** actual result is dynamic
     * another function for calculating time should be in actual result
     * put actual result manually***/
    Assert.assertEquals("11:34",addedHoursToString);
  }

  @Test
  public void addingMinsTest() {
    String addedMinsToString = parseTimeToString(getAddedMinsDate(5));
    /*** actual result is dynamic
     * another function for calculating time should be in actual result
     * put actual result manually***/
    Assert.assertEquals("10:39",addedMinsToString);
  }

  @Test
  public void addingDaysTest() {
    String addedDaysToString = parseDateToString(getAddedDaysDate(30));
    /*** actual result is dynamic
     * another function for calculating time should be in actual result
     * put actual result manually***/
    Assert.assertEquals("2019-07-18",addedDaysToString);
  }
//some
  
  @NotNull
  private String parseDateToString(Date addedDaysDate) {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    return dateFormat.format(addedDaysDate);
  }

  private String parseTimeToString(Date addedMinsDate) {
    DateFormat dateFormat = new SimpleDateFormat("hh:mm");
    return dateFormat.format(addedMinsDate);
  }

  private Date getAddedDaysDate(int daysToAdd) {
    resultDate = DateTool.addDaysToNow(daysToAdd);
    System.out.println("Additional "+daysToAdd+" day(s) from now. The day is: "+resultDate);
    return resultDate;
  }

  private Date getAddedMinsDate(int minsToAdd) {
    resultDate = DateTool.addMinutesToNow(minsToAdd);
    System.out.println("Additional "+minsToAdd+" minute(s) from now. The time is: "+resultDate);
    return resultDate;
  }

  private Date getAddedHoursDate(int hoursToAdd) {
    resultDate = DateTool.addHoursToNow(hoursToAdd);
    System.out.println("Additional "+hoursToAdd+" hour(s) from now. The time is: "+resultDate);
    return resultDate;
  }
}
