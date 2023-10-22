package com.kessie.Repository;

import com.kessie.Model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    Student findById(int studentId);
}
