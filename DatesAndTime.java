import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DatesAndTime {
    public static void main(String[] args) {
        // Difference between 2 Local Dates
        System.out.println("------------ Difference Between 2 Local Dates ---------------");
        LocalDate d1 = LocalDate.of(1992, 8, 17);
        LocalDate d2 = LocalDate.of(1996, 1, 23);
        System.out.println(String.format("Days between %s and %s = %s days", d1, d2, ChronoUnit.DAYS.between(d1, d2)));
        System.out.println(String.format("Months between %s and %s = %s months", d1, d2, ChronoUnit.MONTHS.between(d1, d2)));

        // Date and time with Zone information
        System.out.println("----------- Date and Time with Zone Information ---------------");
        // Without Zone Info
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.AUGUST, 27, 8, 0);
        System.out.println(dateTime);
        // With Zone Info
        ZoneId zoneId = ZoneId.of("UTC+2");
        ZonedDateTime dateTime1 = ZonedDateTime.of(2020, 4, 23, 0, 0, 2, 331, zoneId);
        System.out.println(dateTime1);
        ZonedDateTime now = ZonedDateTime.now(); // Default time zone
        System.out.println(now);
        ZonedDateTime parsed = ZonedDateTime.parse("2016-07-27T07:00:00+01:00[Europe/Stockholm]");
        System.out.println(parsed);

        // Operations on dates and times
        System.out.println("----------- Operations on dates and times ---------------");
        LocalDate nowNow = LocalDate.now();
        System.out.println("Date Now is " + nowNow);
        LocalDate nextWeek = nowNow.plusWeeks(1);
        System.out.println("Next week will be " + nextWeek);
        LocalDate fiftyDaysTime = nowNow.plusDays(50);
        System.out.println("50 days time will be " + fiftyDaysTime);
        LocalDateTime nowNowAgain = LocalDateTime.now();
        System.out.println("Date and time now is " + nowNowAgain);
        LocalDateTime tenHoursFromNow = nowNowAgain.plusHours(10);
        System.out.println("Ten hours from now will be " + tenHoursFromNow);
        LocalDateTime byThisTimeInJune = nowNowAgain.withMonth(6);
        System.out.println("This same time in June was/will be " + byThisTimeInJune);
        // Chaining these methods together
        LocalDateTime oneYearOneMonthAndOneDayFromNow = LocalDateTime.now().plusYears(1).plusMonths(1).plusDays(1);
        System.out.println("1 year, 1 month and 1 day from now will be " + oneYearOneMonthAndOneDayFromNow);

        // Date Time Formatting
        System.out.println("-------------------- Date Time Formatting ----------------------");
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("d-MM-yyyy HH:mm");
        DateTimeFormatter dTF2 = DateTimeFormatter.ofPattern("EEEE d, MMMM, yyyy HH:mm");
        String myBirthdayString = "1992-08-17T11:12";
        LocalDateTime formatless = LocalDateTime.parse(myBirthdayString);
        System.out.println(formatless);
        // Formatted
        System.out.println(dTF.format(formatless));
        System.out.println(dTF2.format(formatless));

    }
}
