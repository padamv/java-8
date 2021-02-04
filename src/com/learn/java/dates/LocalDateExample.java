package com.learn.java.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {


    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println("localDate: " + localDate);

        LocalDate localDate1 = LocalDate.of(2018, 07, 17);
        System.out.println("localDate1: " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018, 365);
        System.out.println("localDate2: " + localDate2);

        // Get values from localDate

        System.out.println("getMonth: " + localDate.getMonth());
        System.out.println("getMonthValue: " + localDate.getMonthValue());
        System.out.println("getDayOfWeek: " + localDate.getDayOfWeek());
        System.out.println("getDayOfYear: " + localDate.getDayOfYear());
        System.out.println("Day of montb using get: " + localDate.get(ChronoField.DAY_OF_MONTH));

        //Modifying Local Date

        System.out.println("plusDays: " + localDate.plusDays(2));
        System.out.println("plusMonths: " + localDate.plusMonths(2));
        System.out.println("minusDays: " + localDate.minusDays(2));
        System.out.println("withYear: " + localDate.withYear(2019));
        System.out.println("with ChronoField: " + localDate.with(ChronoField.YEAR, 2020));
        System.out.println("with TemporalAdjusters: " + localDate.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("ChronoUnit minus: " + localDate.minus(1, ChronoUnit.YEARS));

    }
}