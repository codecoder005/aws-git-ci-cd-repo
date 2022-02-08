package com.orgofarms.awsgitcicdapp.employee.server;

import com.orgofarms.awsgitcicdapp.employee.jpa.entity.EmployeeEntity;
import com.orgofarms.awsgitcicdapp.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeEntity> getAllEmployees() {
        List<EmployeeEntity> all = new ArrayList<>();
        try{
            employeeRepository.findAll().forEach(e -> all.add(e));
            return all;
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
}
