package com.learn.java.optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    // orElse
    public static String optionalOrElse(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    // orElseGet
    public static String optionalOrElseGet(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElseGet(() ->"Default");
        return name;
    }

    // orElseThrow
    public static String optionalOrElseThrow(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName)
                .orElseThrow(() ->new RuntimeException("No Data Available"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println("OrElse: " + optionalOrElse());
        System.out.println("OrElseGet: " + optionalOrElseGet());
        System.out.println("OrElseGet: " + optionalOrElseThrow());
    }
}
