package com.example.studentmysqlandjdbc.model;

import com.example.studentmysqlandjdbc.repositories.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class studentTest {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setup() {
        Student std = new Student();
        std.setName("Viggo");
        std.setBornDate(LocalDate.now());
        std.setBornTime(LocalDate.now());
        studentRepository.save(std);
    }

    @Test
    void test() {
        assertEquals(1,1);
    }



    @Test
    void testStudentByName() {
        assertEquals("Viggo", studentRepository.findByName("Viggo") );
    }
}
