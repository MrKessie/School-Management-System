package com.kessie.Service;

import com.kessie.Model.Department;
import com.kessie.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    StudentService studentService;
    public Department addDepartment(String departmentName){
        int departmentId = studentService.randomNumbers();
        Department department = new Department();
        department.setDepartmentId(departmentId);
        department.setDepartmentName(departmentName);
        departmentRepository.save(department);
        return department;
    }

    public Department removeDepartment(int departmentId){
        Department department = departmentRepository.findById(departmentId);
        departmentRepository.delete(department);
        return department;
    }

    public List<Department> allDepartment(){
        List<Department> departments = (List<Department>) departmentRepository.findAll();
        return  departments;
    }
}
