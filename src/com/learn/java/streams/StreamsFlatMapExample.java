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
                .distinct()
                .collect(Collectors.toList());

        return studentActivities;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities: " + printStudentActivities());
    }
}
