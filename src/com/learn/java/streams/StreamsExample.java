package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        // student name and the activities in a map

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGradeLevel() >= 3))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }
}
