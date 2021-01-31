package com.learn.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = (i) -> {return i % 2 == 0;};
    static Predicate<Integer> p1 = (i) -> i % 2 == 0;

    public static void main(String[] args) {

        System.out.println(p.test(4));

        System.out.println(p1.test(4));
    }
}
