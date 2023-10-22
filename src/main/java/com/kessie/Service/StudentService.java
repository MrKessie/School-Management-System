package com.kessie.Service;

import com.kessie.Model.Department;
import com.kessie.Model.Student;
import com.kessie.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(String name, Department department, String dob, String dateAdded){
        int studentId = randomNumbers();
        Student student = new Student();
        student.setStudentId(studentId);
        student.setName(name);
        student.setDepartment(department);
        student.setDob(dob);
        student.setDateAdmitted(dateAdded);
        studentRepository.save(student);
        return student;
    }

    public Student removeStudent(int studentId){
        Student student = studentRepository.findById(studentId);
        studentRepository.delete(student);
        return student;
    }

    public List<Student> allStudents(){
        List<Student> students = (List<Student>) studentRepository.findAll();
        return students;
    }

    public int randomNumbers(){
        Random random = new Random();
        int max = 99999;
        int min = 10000;
        return random.nextInt(max - min + 1) + min;
    }
}
