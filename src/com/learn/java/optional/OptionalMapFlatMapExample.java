package com.learn.java.optional;

import com.learn.java.data.Bike;
import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional.filter(student -> student.getGpa() >= 3.8)
                .ifPresent(student -> System.out.println(student));
    }

    //map
    public static void optionalMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()) {
            Optional<String> stringOptional = studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    //flatMap
    public static void optionalFlatMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<String> name = studentOptional
                .filter(student -> student.getGpa() >= 3.5)  //Optional<Student>
                .flatMap(student -> student.getBike())  //returns -> Optional<Bike>
                .map(Bike::getName);  //

        name.ifPresent(s -> System.out.println("name: " + s));
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
