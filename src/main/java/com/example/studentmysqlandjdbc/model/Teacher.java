package com.example.studentmysqlandjdbc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Teacher {

    @Id
    private int id;

    String name;
    LocalDate bornDate;
    LocalTime timeOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public LocalTime getTimeOfBirth() {
        return timeOfBirth;
    }

    public void setTimeOfBirth(LocalTime timeOfBirth) {
        this.timeOfBirth = timeOfBirth;
    }
}
