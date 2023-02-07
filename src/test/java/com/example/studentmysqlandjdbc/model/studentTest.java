package com.example.studentmysqlandjdbc.model;

import com.example.studentmysqlandjdbc.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class studentTest {

    @Autowired
    StudentRepository studentRepository;
    @Test
    void test() {
        assertEquals(1,1);
    }

    @Test
    void testStudentByName() {
        assertEquals("Viggo", studentRepository.findByName );
    }
}
