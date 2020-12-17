import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateClass {
    public static void main(String[] args) {

        // Util Date and SQL Date
        System.out.println("--------------- Util Date and SQl Date ---------------");
        Date utilDate = new Date();
        System.out.println("Util Date is : " + utilDate);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println("SQL Date is : " + sqlDate);
        DateFormat dateFormat = new SimpleDateFormat("dd\u2763MM\u2764yyyy hh:mm:ss");
        System.out.println(dateFormat.format(sqlDate));

        // Local Date
        System.out.println("---------------- Local Date ------------------");
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.parse("2020-12-09");
        LocalDate localDate2 = LocalDate.of(2020, 10, 23);
        LocalDate localDate3 = LocalDate.now(ZoneId.systemDefault());
        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

        // Local Date Time
        System.out.println("------------------ Local Date Time -------------------");
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.parse("2020-09-02T22:45:52");
        LocalDateTime localDateTime2 = LocalDateTime.of(2020, 10, 9, 22, 23);
        LocalDateTime localDateTime3 = LocalDateTime.of(2020, 10, 9, 22, 23, 54, 935321243);
        LocalDateTime localDateTime4 = LocalDateTime.now(ZoneId.systemDefault());
        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
        System.out.println(localDateTime4);

        // Using Calendar to set specific dates
        System.out.println("------------------ Using Calendar to set specific dates --------------------------");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1992, 7, 17, 4, 3, 45);
        Date date2 = calendar.getTime();
        System.out.println("I was born on " + date2);

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2007, Calendar.JULY, 23);
        Date newDate = calendar1.getTime();
        System.out.println("I gave my life to Christ on " + newDate);

        // Converting Date to a certain String format
        System.out.println("------------------ Converting Date to a certain String Format --------------------------");
        Date today = new Date();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println(dateFormat1.format(today));
        dateFormat1.applyPattern("hh:mm:ss ---> E, dd-MM-yyyy");
        System.out.println(dateFormat1.format(today));

        // Local Time
        System.out.println("----------------------- Local Time -----------------------"); // This gives just the time part of a date
        LocalTime time = LocalTime.now();
        LocalTime time1 = LocalTime.NOON;
        LocalTime time2 = LocalTime.MIDNIGHT;
        LocalTime time3 = LocalTime.of(12,34, 43, 234);
        LocalTime time4 = LocalTime.MAX;
        LocalTime time5 = LocalTime.MIN;
        System.out.println(time);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(time5);
        System.out.println("Adding hours, minutes, seconds and nanoseconds");
        System.out.println(time2);
        time2 = time2.plusMinutes(3);
        time2 = time2.plusSeconds(23);
        time2 = time2.plusNanos(2342);
        System.out.println(time2);

        // Convert formatted String representation of date to date object
        System.out.println("--------- Convert formatted String representation of date to date object -----------");
        System.out.println(convertDate("17/08/1992", "dd/MM/yyyy"));
        System.out.println(convertDate("12/04/3213 11:12:34 Wed", "dd/MM/yyyy hh:mm:ss E")); //


        // Comparing Date Objects
        System.out.println("-------------- Comparing Date Objects --------------");
        final Date today1 = new Date();
        final Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1990, Calendar.NOVEMBER, 1, 0, 0, 0);
        Date birthdate = calendar2.getTime();
        final Calendar calendar3 = Calendar.getInstance();
        calendar3.set(1990, Calendar.NOVEMBER, 1, 0, 0, 0);
        Date samebirthdate = calendar3.getTime();
        calendar3.set(1992, Calendar.AUGUST, 17);
        Date myBirthDate = calendar3.getTime();

        System.out.printf("Is %1$tF before %2$tF? %3$b%n", today1, birthdate, today1.after(birthdate));
        System.out.printf("Is %1$tF before %2$tF? %3$b%n", today1, today1, today1.equals(today1));
        System.out.printf("Is %1$tF before %2$tF? %3$b%n", birthdate, samebirthdate, birthdate.before(samebirthdate));
        System.out.printf("Compare %1$tF to %2$tF ===> %3$d%n", myBirthDate, myBirthDate, myBirthDate.compareTo(myBirthDate));
        System.out.printf("Compare %1$tF to %2$tF ===> %3$d%n", birthdate, myBirthDate, birthdate.compareTo(myBirthDate));
        System.out.printf("Compare %1$tF to %2$tF ===> %3$d%n", myBirthDate, birthdate, myBirthDate.compareTo(birthdate));

        // Same thing applies to LocalDate except that for that case, we use isBefore, isAfter for the before and after respectively
// Also, for LocalDate, "equals" method checks if the parameter reference equals the date first whereas "isEqual" directly calls compareTo0.


        // Find out about time zones later on ... the example shown in the book didn't work

    }

    public static Date convertDate(String dateString, String pattern){
        Date date = null;
        SimpleDateFormat dateFormat2 = new SimpleDateFormat(pattern);
        try{
        date = dateFormat2.parse(dateString);
        return date;
        } catch (ParseException e){
            System.out.println("Ensure that the date entered follows the pattern");
        }
        return date;
    }
}
