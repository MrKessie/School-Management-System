package com.kessie.Repository;

import com.kessie.Model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    Course findById(int courseId);
}
