package com.kessie.Controller;

import com.kessie.Model.Department;
import com.kessie.Model.Teacher;
import com.kessie.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @PostMapping("/add")
    @ResponseBody
    public Teacher addTeacher(@RequestParam String name, @RequestParam Department department, @RequestParam String dob, @RequestParam String dateAdded){
        Teacher teacher = teacherService.addTeacher(name, department, dob, dateAdded);
        return teacher;
    }
    @PostMapping("/remove")
    @ResponseBody
    public Teacher removeTeacher(@RequestParam int teacherId){
        Teacher teacher = teacherService.removeTeacher(teacherId);
        return teacher;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Teacher> allTeachers(){
        List<Teacher> teachers = teacherService.allTeachers();
        return  teachers;
    }

}
