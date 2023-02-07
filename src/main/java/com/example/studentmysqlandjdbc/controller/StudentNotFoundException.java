package com.example.studentmysqlandjdbc.controller;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String name) {
        super("Student not found" + " " + name);
    }

}
