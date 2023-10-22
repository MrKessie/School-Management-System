package com.kessie.Service;

import com.kessie.Model.Department;
import com.kessie.Model.Teacher;
import com.kessie.Repository.DepartmentRepository;
import com.kessie.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    DepartmentRepository departmentRepository;

    public Teacher addTeacher(String name, Department department, String dob, String dateAdded){
        int teacherId = randomNumbers();
        Teacher teacher = new Teacher();
        teacher.setTeacherId(teacherId);
        teacher.setName(name);
        teacher.setDepartment(department);
        teacher.setDob(dob);
        teacher.setDateAdded(dateAdded);
        teacherRepository.save(teacher);
        return teacher;
    }

    public Teacher removeTeacher(int teacherId){
        Teacher teacher = teacherRepository.findById(teacherId);
        teacherRepository.delete(teacher);
        return teacher;
    }

    public List<Teacher> allTeachers(){
        List<Teacher> teachers = (List<Teacher>) teacherRepository.findAll();
       return teachers;
    }

    public int randomNumbers(){
        Random random = new Random();
        int max = 99999;
        int min = 10000;
        return random.nextInt(max - min + 1) + min;
    }
}
