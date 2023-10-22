package com.kessie.Service;

import com.kessie.Model.Admin;
import com.kessie.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;
    public Admin addAdmin(String name, String dob, String dateAdded){
        int adminId = randomNumbers();
        Admin admin = new Admin();
        admin.setAdminId(adminId);
        admin.setName(name);
        admin.setDob(dob);
        admin.setDateAdded(dateAdded);
        adminRepository.save(admin);
        return admin;
    }

    public Admin removeAdmin(int adminId){
        Admin admin = adminRepository.findById(adminId);
        adminRepository.delete(admin);
        return admin;
    }

    public List<Admin> allAdmins(){
        List<Admin> admins = (List<Admin>) adminRepository.findAll();
        return  admins;
    }

    public int randomNumbers(){
        Random random = new Random();
        int min = 10000;
        int max = 99999;
        return  random.nextInt(max - min + 1) + min;
    }
}
