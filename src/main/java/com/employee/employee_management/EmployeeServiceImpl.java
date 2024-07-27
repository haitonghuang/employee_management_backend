package com.employee.employee_management;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public ArrayList<Employee> findAllEmployees(){
        return (ArrayList<Employee>) employeeRepository.findAll();
        
    }
    @Override
    public Employee findEmployeeById(long id){
        return employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee Not Found"));
       
    }

    
    @Override
    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
        
    }
    @Override
    public void removeEmployeeById(long id){
        employeeRepository.deleteById(id);
    }
    
}
