package com.kessie.Service;

import com.kessie.Model.Course;
import com.kessie.Model.CourseRegistration;
import com.kessie.Model.Department;
import com.kessie.Model.Student;
import com.kessie.Repository.CourseRegistrationRepository;
import com.kessie.Repository.CourseRepository;
import com.kessie.Repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CourseRegistrationService {
    @Autowired
    CourseRegistrationRepository courseRegistrationRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    StudentRepository studentRepository;

//    @Autowired
//    public CourseRegistrationService(
//            CourseRegistrationRepository courseRegistrationRepository,
//            StudentRepository studentRepository,
//            CourseRepository courseRepository
//    ) {
//        this.courseRegistrationRepository = courseRegistrationRepository;
//        this.studentRepository = studentRepository;
//        this.courseRepository = courseRepository;
//    }

    //public CourseRegistration registerCourse(Student studentId, Course courseId){
//        int registrationId = randomNumbers();
//        System.out.println("Select the courses you want to register from the list of courses below: ");
//        List<Course> course = (List<Course>) courseRepository.findAll();
//        CourseRegistration courseRegistration = new CourseRegistration();
//        return courseRegistration;
    //}

    public CourseRegistration registerCourse(Student student, Course course, CourseRegistration registration) {
        CourseRegistration courseRegistration = new CourseRegistration();
        courseRegistration.setRegistrationId(randomNumbers());
        courseRegistration.setStudent(student);
        courseRegistration.setCourse(course);
        studentRepository.findById(registration.getStudent().getStudentId());
        courseRepository.findById(registration.getCourse().getCourseId());

//        if (isStudentAlreadyRegistered(student, course)) {
//            throw new RegistrationException("Student is already registered for this course");
//        }

        return courseRegistrationRepository.save(registration);
    }

//    private boolean isStudentAlreadyRegistered(Student student, Course course) {
//        return courseRegistrationRepository.findByStudentAndCourse(student, course).isPresent();
//    }

    public int randomNumbers(){
        Random random = new Random();
        int min = 10000;
        int max = 99999;
        return random.nextInt(max - min + 1) + min;
    }
}
