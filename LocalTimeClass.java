import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeClass {
    public static void main(String[] args) {
        // LocalTime is an immutable class and thread-safe, used to represent time and is represented to nanosecond precision.
        // It does not store or represent a date or time-zone. Instead, it is a description of the local time as seen on a wall clock.
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(ZoneId.SHORT_IDS);
        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Africa/Lagos");
        ZoneId zone3 = ZoneId.of("America/Chicago");
        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);
        LocalTime now3 = LocalTime.now(zone3);
        System.out.println(now1);
        System.out.println(now2);
        System.out.println(now3);

        LocalTime brazil = LocalTime.now(ZoneId.of("Brazil/East"));
        System.out.println("Brazil now: " + brazil);
        LocalTime berlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("Berlin now: " + berlin);
        System.out.println("Minutes Between Brazil and Berlin : " + ChronoUnit.MINUTES.between(brazil, berlin) + " mins");


    }
}
