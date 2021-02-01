package com.learn.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){

        return integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y);

    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> integerList1 = new ArrayList<>();

        int maxValue = findMaxValue(integerList);
        System.out.println("max value is: " + maxValue);

        int maxValue1 = findMaxValue(integerList1);
        System.out.println("max value is: " + maxValue1);
    }
}
