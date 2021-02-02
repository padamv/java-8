package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {


    public static void main(String[] args) {
        List<String> namesList = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName, toList()));

        Set<String> namesSet = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName, toSet()));

        System.out.println("namesList: " + namesList);
        System.out.println("namesSet: " + namesSet);
    }
}
