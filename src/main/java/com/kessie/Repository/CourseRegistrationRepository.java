package com.kessie.Repository;

import com.kessie.Model.CourseRegistration;
import com.kessie.Model.Course;
import com.kessie.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistrationRepository extends CrudRepository<CourseRegistration, Integer> {

    //CourseRegistration findByStudentAndCourse(Student studentId, Course courseId, CourseRegistration courseRegistration);

}
