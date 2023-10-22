package com.kessie.Service;

import com.kessie.Model.Course;
import com.kessie.Model.Department;
import com.kessie.Model.Teacher;
import com.kessie.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public Course addCourse(String courseTitle, Department department, Teacher teacher){
        int courseId = randomNumbers();
        Course course = new Course();
        course.setCourseId(courseId);
        course.setCourseTitle(courseTitle);
        course.setDepartment(department);
        course.setTeacher(teacher);
        courseRepository.save(course);
        return  course;
    }

    public Course removeCourse(int courseId){
        Course course = courseRepository.findById(courseId);
        courseRepository.delete(course);
        return course;
    }

    public List<Course> allCourses(){
        List<Course> courses = (List<Course>) courseRepository.findAll();
        return courses;
    }


    public int randomNumbers(){
        Random random = new Random();
        int min = 10000;
        int max = 99999;
        return random.nextInt(max - min + 1) + min;
    }
}
