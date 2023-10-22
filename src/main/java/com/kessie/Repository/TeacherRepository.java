package com.kessie.Repository;

import com.kessie.Model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

    Teacher findById(int teacherId);
}
