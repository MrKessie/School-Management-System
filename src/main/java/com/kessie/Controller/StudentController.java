package com.kessie.Controller;

import com.kessie.Model.Department;
import com.kessie.Model.Student;
import com.kessie.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    @ResponseBody
    public Student addStudent(@RequestParam String name, @RequestParam Department department, @RequestParam String dob, @RequestParam String dateAdmitted){
        Student student = studentService.addStudent(name, department, dob, dateAdmitted);
        return student;
    }
    @PostMapping("/remove")
    @ResponseBody
    public Student removeStudent(@RequestParam int studentId){
        Student student = studentService.removeStudent(studentId);
        return  student;
    }
    @GetMapping("/all")
    @ResponseBody
    public List<Student> allStudents(){
        List<Student> students = studentService.allStudents();
        return students;
    }

}
