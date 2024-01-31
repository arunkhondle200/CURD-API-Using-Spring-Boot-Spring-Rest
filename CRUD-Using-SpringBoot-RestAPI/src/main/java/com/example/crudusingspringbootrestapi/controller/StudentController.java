package com.example.crudusingspringbootrestapi.controller;

import com.example.crudusingspringbootrestapi.model.Student;
import com.example.crudusingspringbootrestapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
      return   studentService.addStudent(student);
    }
   @PutMapping
   public Student updateStudent(@RequestBody Student student){
     return studentService.updateStudent(student);
    }
    @DeleteMapping
    public void deleteStudent(@RequestBody Student student){
        studentService.deleteStudent(student);
    }
   @GetMapping("/{id}")
   public Student getStudentByID(@PathVariable int id){
    return studentService.getStudentByID(id);
    }

    @GetMapping
    public List<Student> getAllStudent(){
      return    studentService.getAllStudent();
    }

}
