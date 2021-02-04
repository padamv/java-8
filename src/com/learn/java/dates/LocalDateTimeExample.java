package com.learn.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {


    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);

        LocalDateTime localDateTime1 =
                LocalDateTime.of(2018, 03, 21, 23, 33, 33, 12312);
        System.out.println("localDateTime1: " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime2: " + localDateTime2);

        //Getting the time and date from LocalDateTime instance

        System.out.println("hour: " + localDateTime.getHour());
        System.out.println("minute: " + localDateTime.getMinute());
        System.out.println("day: " + localDateTime.getDayOfMonth());
        System.out.println("ChronoField.DAY_OF_MONTH: " + localDateTime.get(ChronoField.DAY_OF_MONTH));

        //modifying LocalDateTime

        System.out.println("plusHours: " + localDateTime.plusHours(2));
        System.out.println("minusDays: " + localDateTime.minusDays(2));
        System.out.println("withMonth: " + localDateTime.withMonth(6));

        // converting LocalDate and LocalTime to LocalDateTime and vice versa
        LocalDate localDate = LocalDate.of(2019, 01, 01);
        System.out.println("atTime: " + localDate.atTime(23, 33));

        LocalTime localTime = LocalTime.of(23, 39);
        System.out.println("atDate: " + localTime.atDate(localDate));

        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println("toLocalDate: " + localDateTime3.toLocalDate());
        System.out.println("toLocalTime: " + localDateTime3.toLocalTime());

    }
}