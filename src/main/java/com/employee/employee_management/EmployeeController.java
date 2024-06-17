package com.employee.employee_management;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@CrossOrigin(origins = "http://localhost:5173",  allowCredentials="true", methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class EmployeeController {
    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/create")
    public void addEmployee(Employee employee){
        employeeServiceImpl.addEmployee(employee);
    }

    @GetMapping("/find/{id}")
    public Employee getEmployeeById(@PathVariable long id){
        // Optional<Employee> employee = Optional.of(employeeServiceImpl.findEmployeeById(id));
        // if(!employee.isPresent()){
        //     throw new ResourceNotFoundException("Employee Not Found");
        // }
        // return ResponseEntity.ok(employee.get());
        return employeeServiceImpl.findEmployeeById(id);

    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        // Optional<Employee> employee = Optional.of(employeeServiceImpl.findEmployeeById(id));
        // if(!employee.isPresent()){
        //     throw new ResourceNotFoundException("Employee Not Found");
        // }
        // return ResponseEntity.ok(employee.get());
        return employeeServiceImpl.findAllEmployees();

    }


}
