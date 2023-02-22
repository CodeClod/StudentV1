package com.example.studentmysqlandjdbc.config;

import com.example.studentmysqlandjdbc.model.Student;
import com.example.studentmysqlandjdbc.model.Teacher;
import com.example.studentmysqlandjdbc.repositories.StudentRepository;
import com.example.studentmysqlandjdbc.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;


    @Override
    public void run(String... args) throws Exception {


        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Calladin");
        s1.setBornDate(LocalDate.now());
        s1.setBornTime(LocalDate.now());
        studentRepository.save(s1);
        System.out.println("Save Successful");
        System.out.println(studentRepository.findAll());

        Student s2 = new Student();
        s1.setId(2);
        s1.setName("Kim Kitsuragi");
        s1.setBornDate(LocalDate.now());
        s1.setBornTime(LocalDate.now());
        studentRepository.save(s1);
        System.out.println("Save Successful");
        System.out.println(studentRepository.findAll());

        Teacher t1 = new Teacher();
        t1.setId(2);
        t1.setName("Dalanar");
        t1.setBornDate(LocalDate.now());
        t1.setTimeOfBirth(LocalTime.now());
        teacherRepository.save(t1);




    }
}
