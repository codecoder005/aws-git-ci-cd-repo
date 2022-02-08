package com.orgofarms.awsgitcicdapp.employee.controller;

import com.orgofarms.awsgitcicdapp.employee.jpa.entity.EmployeeEntity;
import com.orgofarms.awsgitcicdapp.employee.repository.EmployeeRepository;
import com.orgofarms.awsgitcicdapp.employee.server.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/api-status")
    public String getApiStatus(){
        return "Employees is up and running.";
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees(){
        return this.employeeService.getAllEmployees();
    }
}
