package com.learn.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){

        return integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static int findMinValue(List<Integer> integerList){

        return integerList.stream()
                .reduce(0, (x, y) -> x < y ? x : y);   // fails because of the identity value
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){

        return integerList.stream()
                .reduce( (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){

        return integerList.stream()
                .reduce( (x, y) -> x < y ? x : y);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> integerList1 = new ArrayList<>();

        int maxValue = findMaxValue(integerList);
        System.out.println("max value is: " + maxValue);

        int maxValue1 = findMaxValue(integerList1);
        System.out.println("max value is: " + maxValue1);

        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
        if(maxValueOptional.isPresent()){
            System.out.println("MaxValue using optional: " + maxValueOptional.get());
        }else{
            System.out.println("No max value found.");
        }

        int minValue = findMinValue(integerList);
        System.out.println("minValue: " + minValue);

        Optional<Integer> minValueOptional = findMinValueOptional(integerList);
        if(minValueOptional.isPresent()){
            System.out.println("MinValue using optional: " + minValueOptional.get());
        }else{
            System.out.println("No min value found.");
        }
    }
}
