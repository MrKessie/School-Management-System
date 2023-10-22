package com.kessie.Controller;

import com.kessie.Model.Department;
import com.kessie.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @Controller
    @RequestMapping("/department")
public class DepartmentController {
        @Autowired
        DepartmentService departmentService;
    @PostMapping("/add")
    @ResponseBody
    public Department addDepartment(@RequestParam String departmentName){
        Department department = departmentService.addDepartment(departmentName);
        return department;
    }
    @PostMapping("/remove")
    @ResponseBody
    public Department removeDepartment(@RequestParam int departmentId){
        Department department = departmentService.removeDepartment(departmentId);
        return  department;
    }
    @GetMapping("/all")
    @ResponseBody
    public List<Department> allDepartments(){
        List<Department> departments = departmentService.allDepartment();
        return departments;
    }

}
