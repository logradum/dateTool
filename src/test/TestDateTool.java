package test;
import app.DateTool;
import org.jetbrains.annotations.NotNull;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static app.DateTool.addHoursToDate;

public class TestDateTool {

  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");



  @Test
  public void addHoursToDateTest(){
  }

 /* @Test
  public void  addingHoursTest (){
    String addedHoursToString = parseTimeToString(getAddedHoursDate(1));

    *//*** actual result is dynamic
     * another function for calculating time should be in actual result
     * put actual result manually***//*
    Assert.assertEquals("11:34",addedHoursToString);
  }

  @Test
  public void addingMinsTest() {
    String addedMinsToString = parseTimeToString(getAddedMinsDate(5));
    *//*** actual result is dynamic
     * another function for calculating time should be in actual result
     * put actual result manually***//*
    Assert.assertEquals("10:39",addedMinsToString);
  }

  @Test
  public void addingDaysTest() {
    String addedDaysToString = parseDateToString(getAddedDaysDate(30));
    *//*** actual result is dynamic
     * another function for calculating time should be in actual result
     * put actual result manually***//*
    Assert.assertEquals("2019-07-18",addedDaysToString);
  }
*/


}
