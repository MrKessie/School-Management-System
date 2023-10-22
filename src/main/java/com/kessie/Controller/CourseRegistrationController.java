package com.kessie.Controller;

import com.kessie.Model.Course;
import com.kessie.Model.CourseRegistration;
import com.kessie.Model.Student;
import com.kessie.Service.CourseRegistrationService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/course/registration")
public class CourseRegistrationController {
    CourseRegistrationService courseRegistrationService;
    @PostMapping("/register")
    @ResponseBody
    public CourseRegistration registerCourse(@RequestParam Student studentId, @RequestParam Course courseId, @RequestParam CourseRegistration registration) {
        CourseRegistration courseRegistration = courseRegistrationService.registerCourse(studentId, courseId, registration);
        return courseRegistration;
    }
}
