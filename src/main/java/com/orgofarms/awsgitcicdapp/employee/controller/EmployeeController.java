package com.orgofarms.awsgitcicdapp.employee.controller;

import com.orgofarms.awsgitcicdapp.employee.jpa.entity.EmployeeEntity;
import com.orgofarms.awsgitcicdapp.employee.repository.EmployeeRepository;
import com.orgofarms.awsgitcicdapp.employee.server.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{empId}")
    public EmployeeEntity getEmployeeById(@PathVariable Integer empId){
        return this.employeeService.getEmployeeById(empId);
    }
}
