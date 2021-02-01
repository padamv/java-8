package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by Name: ");
        sortStudentsByName().forEach(System.out::println);
    }
}
