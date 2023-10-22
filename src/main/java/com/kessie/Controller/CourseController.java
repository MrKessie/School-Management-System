package com.kessie.Controller;

import com.kessie.Model.Course;
import com.kessie.Model.Department;
import com.kessie.Model.Teacher;
import com.kessie.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;
@PostMapping("/add")
@ResponseBody
    public Course addCourse(@RequestParam String courseTitle, @RequestParam Department department, @RequestParam Teacher teacher){
        Course course = courseService.addCourse(courseTitle, department, teacher);
        System.out.println("Course has been added successfully.");
        return  course;
    }
@PostMapping("/remove")
@ResponseBody
    public Course removeCourse(@RequestParam int courseId){
        Course course = courseService.removeCourse(courseId);
        System.out.println("Course has been removed successfully.");
        return course;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Course> allCourses(){
        List<Course> courses = courseService.allCourses();
        return courses;
    }
}
