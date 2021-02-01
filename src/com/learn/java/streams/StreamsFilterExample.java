package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {

       return StudentDataBase.getAllStudents().stream()    //Stream<Student>
                .filter(student -> student.getGender().equals(("female")))   //Stream<Student> (only female)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        //System.out.println("filterStudents: " + filterStudents());
        filterStudents().forEach(System.out::println);
    }
}
