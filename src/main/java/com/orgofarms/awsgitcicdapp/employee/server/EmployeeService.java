package com.orgofarms.awsgitcicdapp.employee.server;

import com.orgofarms.awsgitcicdapp.employee.jpa.entity.EmployeeEntity;
import com.orgofarms.awsgitcicdapp.employee.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
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

    public EmployeeEntity getEmployeeById(Integer empId) {
        EmployeeEntity employee = null;
        try{
            employee = this.employeeRepository.findById(empId).get();
        }catch (NoSuchElementException e){
            LOGGER.info("No employee found with that ID");
        }
        return employee;
    }
}
