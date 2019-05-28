package pl.sda.javastart2.enums.Dates;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class DatesExample {
    public static void main(String[] args) {
        instatnt();
        duration();
        localDateTime();
        dateUtils();
    }

    private static void dateUtils() {
    Date date = new Date();
    Instant instant = date.toInstant();

    Date frome = Date.from(instant);
    Calendar calendar = Calendar.getInstance();
    Instant calendarToInstant = calendar.toInstant();
    LocalDate now = LocalDate.now();
        System.out.println("Is leap year:"+now.isLeapYear());
        now.isBefore(LocalDate.of(2004,1,21));
        System.out.println("3 weekds ago:"+now.minusWeeks(3));

    }

    private static void localDateTime() {
        LocalDateTime.now();
        Date date = new Date();
        System.out.println("LocalDateTime:" + LocalDateTime.now());
        System.out.println("date " + date);
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime of = LocalDateTime.of(localDate, localTime);
        System.out.println(of);

        LocalDateTime.of(2014, 1, 23, 12, 43, 43, 1);


    }

    private static void duration() {
        Duration duration30days = Duration.ofDays(30);
        System.out.println("30 days=: " + duration30days);
    }


    private static void instatnt() {
        Instant now = Instant.now();
        System.out.println("Current timestamp:" + now);
        Instant epochMilli = Instant.ofEpochMilli(342364545468L);
        System.out.println("Specific time from epoch: " + epochMilli);
    }

}
