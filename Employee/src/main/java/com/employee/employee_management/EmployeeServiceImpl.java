package com.employee.employee_management;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public ArrayList<Employee> findAllEmployees() {
        return (ArrayList<Employee>) employeeRepository.findAll();

    }

    @Override
    public Employee findEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Found"));

    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public void removeEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void updateEmployee(long id, Employee employee) {
        Employee updatedEmployee = this.findEmployeeById(id);
        updatedEmployee.setDepartment(employee.getDepartment());
        updatedEmployee.setEmail(employee.getEmail());
        updatedEmployee.setFullName(employee.getFullName());
        updatedEmployee.setPhoneNumber(employee.getPhoneNumber());
        updatedEmployee.setTitle(employee.getTitle());
        this.addEmployee(updatedEmployee);
    }

}
