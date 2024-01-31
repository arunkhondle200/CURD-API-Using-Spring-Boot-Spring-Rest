package com.example.crudusingspringbootrestapi.service;

import com.example.crudusingspringbootrestapi.dao.StudentDao;
import com.example.crudusingspringbootrestapi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;
    public Student addStudent(Student student){
        return studentDao.save(student);
    }
    public Student updateStudent(Student student){
        return studentDao.save(student);
    }
    public void deleteStudent(Student student){
        studentDao.delete(student);
    }
    public Student getStudentByID(int id){
        return studentDao.findById(id).get();
    }
    public List<Student> getAllStudent(){
        return (List<Student>) studentDao.findAll();
    }

}
