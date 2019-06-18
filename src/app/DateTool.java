package app;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.Date;

public class DateTool {

  static Date now = new Date();
  static Calendar calendar = Calendar.getInstance();

  @NotNull
  public static Date addHoursToNow(int hoursToAdd) {
    getCalendarDateNow();
    calendar.add(Calendar.HOUR, hoursToAdd);
    return calendar.getTime();
  }

  @NotNull
  public static Date addMinutesToNow(int minsToAdd) {
    getCalendarDateNow();
    calendar.add(Calendar.MINUTE, minsToAdd);
    return calendar.getTime();
  }

  @NotNull
  public static Date addDaysToNow(int daysToAdd) {
    getCalendarDateNow();
    calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);
    return calendar.getTime();
  }

  public static void getCalendarDateNow(){
    calendar.setTime(now);
  }

}

/*** упростить и убрть повторения
        сделать ассерты по времени*/
