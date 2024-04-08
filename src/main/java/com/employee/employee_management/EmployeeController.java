package com.employee.employee_management;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/")
    public void addEmployee(){
        employeeServiceImpl.addEmployee();
    }

    @GetMapping("/find/{id}")
    public Employee getEmployeeById(@PathVariable long id){
        return employeeServiceImpl.findEmployeeById(id);
    }


}
