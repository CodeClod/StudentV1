package com.example.studentmysqlandjdbc.controller;

import com.example.studentmysqlandjdbc.model.Student;
import com.example.studentmysqlandjdbc.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudRESTController {

    @Autowired
    StudentRepository studentRepository;

     @GetMapping("/stud1/{name}")
    public Student getstud1byname(@PathVariable String name) {
         return new Student();
     }

     @GetMapping("/stud2/{name}")
    public Student getstud2byname(@PathVariable Optional<String> name) {
         if (name.isPresent()) {
             return new Student(name.get());
         }
         else {
             return new Student("");
         }
     }
     @GetMapping("/stud3/{name}")
    public Student getstud3byname(@PathVariable String name) {
         var obj = studentRepository.findByName(name).orElse(new Student(name + "not found"));
         return obj;
     }

    @GetMapping("/stud4/{name}")
    public Student getstud4byname(@PathVariable String name) {
         //var obj = studentRepository.findByName(name).orElseThrow(() -> new RuntimeException("Not found"));
         var obj = studentRepository.findByName(name).orElseThrow(() -> new StudentNotFoundException(name));
         return obj;

    }

    @GetMapping("/stud5/{name}")
    public ResponseEntity<Student> getstud5byname(@PathVariable String name) {
         var stud = studentRepository.findByName(name);
         if (stud.isPresent()) {
             return new ResponseEntity<>(stud.get(), HttpStatus.OK);
         } else {
             return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
         }
    }


    @PostMapping("/student")
    @ResponseStatus(HttpStatus.CREATED)
    public Student postStudent(@RequestBody Student student) {
        System.out.println(student.getName());
        return  studentRepository.save(student);

    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable Integer id) {
         studentRepository.deleteById(id);
         return new ResponseEntity<>(HttpStatus.OK);
    }


}
