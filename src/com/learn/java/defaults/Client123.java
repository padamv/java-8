package com.learn.java.defaults;

public class Client123 implements Interface1, Interface2, Interface3{

    public void methodA(){
        System.out.println("Inside methodA " + Client123.class);
    }

    // 1 -> class that implements the interface
    // 2 -> the sub interface that extends the interface

    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA();  // resolve to the child implementation
        client123.methodB();
        client123.methodC();
    }
}
