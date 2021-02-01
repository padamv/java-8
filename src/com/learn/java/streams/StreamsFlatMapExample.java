package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {

        List<String> studentActivities = StudentDataBase.getAllStudents().stream()  //Stream<Student>
                .map(Student::getActivities)  // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()   // Stream<String> -> with distinct values
                .sorted()
                .collect(Collectors.toList());

        return studentActivities;
    }

    public static Long getStudentActivitiesCount() {

        Long numberOfStudentActivities = StudentDataBase.getAllStudents().stream()  //Stream<Student>
                .map(Student::getActivities)  // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // Stream<String> -> with distinct values
                .count();

        return numberOfStudentActivities;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities: " + printStudentActivities());
        System.out.println("Number of student activities: " + getStudentActivitiesCount());
    }
}
