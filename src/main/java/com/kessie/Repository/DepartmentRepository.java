package com.kessie.Repository;

import com.kessie.Model.Department;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
    Department findById(int departmentId);
}
