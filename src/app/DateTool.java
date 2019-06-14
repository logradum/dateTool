package app;
import java.util.Calendar;
import java.util.Date;

public class DateTool {
  public static Date addHoursToNow(int hoursToAdd) {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.HOUR, hoursToAdd);
    return now;
  }

  public static Date addMinuteToNow(int minsToAdd) {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.MINUTE, minsToAdd);
    return calendar.getTime();
  }

  public static Date addDayToNow(int daysToAdd) {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.HOUR, daysToAdd);
    return now;
  }
}

//some
/*** упростить и убрть повторения
        сделать ассерты по времени*/
