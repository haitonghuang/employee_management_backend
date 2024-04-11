package com.employee.employee_management;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/create")
    public void addEmployee(Employee employee){
        employeeServiceImpl.addEmployee(employee);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        Optional<Employee> employee = employeeServiceImpl.findEmployeeById(id);
        if(!employee.isPresent()){
            throw new ResourceNotFoundException('employee not found');
        }
        return ResponseEntity.ok(employee.get());
    }


}
