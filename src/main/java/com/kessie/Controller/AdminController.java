package com.kessie.Controller;

import com.kessie.Model.Admin;
import com.kessie.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping("/add")
    @ResponseBody
    public Admin addAdmin(@RequestParam String name, @RequestParam String dob, @RequestParam String dateAdded){
        Admin admin = adminService.addAdmin(name, dob, dateAdded);
        System.out.println("Admin has been added successfully.");
        return  admin;
    }
    @PostMapping("/remove")
    @ResponseBody
    public Admin removeAdmin(@RequestParam int adminId){
        Admin admin = adminService.removeAdmin(adminId);
        System.out.println("Admin has been removed successfully.");
        return admin;
    }
    @GetMapping("/all")
    @ResponseBody
    public List<Admin> allAdmins(){
        List<Admin> admins = adminService.allAdmins();
        System.out.println("Below are all the list of admins: ");
        return  admins;
    }
}
