package app;
import org.jetbrains.annotations.NotNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTool {



  static Calendar calendar = Calendar.getInstance();
  Date resultDate = new Date();


  public static Date addHoursToDate(int hoursToAdd){
    return addHoursToDate(new Date(), hoursToAdd);
  }

  public static Date addHoursToDate(Date date, int hoursToAdd){
    calendar.setTime(date);
    calendar.add(Calendar.HOUR, hoursToAdd);
    return calendar.getTime();
  }

  public static Date addHoursToDate(String format, int hoursToAdd){


    return null;
  }
  @NotNull
  public static Date addHoursToNow(int hoursToAdd) {
    calendar.setTime(new Date());
    calendar.add(Calendar.HOUR, hoursToAdd);
    return calendar.getTime();
  }

  @NotNull
  public static Date addMinutesToNow(int minsToAdd) {
    calendar.setTime(new Date());
    calendar.add(Calendar.MINUTE, minsToAdd);
    return calendar.getTime();
  }

  @NotNull
  public static Date addDaysToNow(int daysToAdd) {
    calendar.setTime(new Date());
    calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);
    return calendar.getTime();
  }

  @NotNull
  public String parseDateToString(Date addedDaysDate) {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    return dateFormat.format(addedDaysDate);
  }

  public String parseTimeToString(Date addedMinsDate) {
    DateFormat dateFormat = new SimpleDateFormat("hh:mm");
    return dateFormat.format(addedMinsDate);
  }

  public Date getAddedDaysDate(int daysToAdd) {
    DateTool.addDaysToNow(daysToAdd);
    System.out.println("Additional "+daysToAdd+" day(s) from now. The day is: "+resultDate);
    return resultDate;
  }

  public Date getAddedMinsDate(int minsToAdd) {
    resultDate = DateTool.addMinutesToNow(minsToAdd);
    System.out.println("Additional "+minsToAdd+" minute(s) from now. The time is: "+resultDate);
    return resultDate;
  }

  public Date getAddedHoursDate(int hoursToAdd) {
    DateTool.addHoursToNow(hoursToAdd);
    System.out.println("Additional "+hoursToAdd+" hour(s) from now. The time is: "+resultDate);
    return resultDate;
  }

}

/*** упростить и убрть повторения
        сделать ассерты по времени*/
