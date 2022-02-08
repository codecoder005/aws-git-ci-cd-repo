package com.orgofarms.awsgitcicdapp.employee.repository;

import com.orgofarms.awsgitcicdapp.employee.jpa.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {
}
