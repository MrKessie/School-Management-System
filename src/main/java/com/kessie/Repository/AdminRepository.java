package com.kessie.Repository;

import com.kessie.Model.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
    Admin findById(int adminId);
}
