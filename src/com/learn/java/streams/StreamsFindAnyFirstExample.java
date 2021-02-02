package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){

        return StudentDataBase.getAllStudents().stream()
                //Adam
                //Jenny
                //Emily
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){

        return StudentDataBase.getAllStudents().stream()
                //Adam
                //Jenny
                //Emily
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> studentOptionalFindAny = findAnyStudent();
        if (studentOptionalFindAny.isPresent()) {
            System.out.println("Found The student: " + studentOptionalFindAny.get());
        }else{
            System.out.println("Student not found!");
        }

        Optional<Student> studentOptionalFindFirst = findFirstStudent();
        if (studentOptionalFindFirst.isPresent()) {
            System.out.println("Found The student: " + studentOptionalFindFirst.get());
        }else{
            System.out.println("Student not found!");
        }

    }
}
