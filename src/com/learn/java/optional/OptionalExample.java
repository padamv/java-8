package com.learn.java.optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
        //Student student = StudentDataBase.studentSupplier.get();
    Student student = null;
        if(student != null){
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional(){
        //Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null); //Optional.empty()

        if (optionalStudent.isPresent()) {
            return optionalStudent.map(Student::getName);  //Optional<String>
        }

        return Optional.empty();  // Optional with no value

    }

    public static void main(String[] args) {
        /* String name = getStudentName();
        if(name != null) {
            System.out.println("Length of the student Name: " + name.length());
        }else{
            System.out.println("Name not found");
        }*/

        Optional<String> stringOptional = getStudentNameOptional();

        if (stringOptional.isPresent()) {
            System.out.println("Length of the student Name: " + stringOptional.get().length());;
        }else{
            System.out.println("Name not found");
        }


    }
}
