package com.example.crudusingspringbootrestapi.dao;

import com.example.crudusingspringbootrestapi.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {
}
