package com.employee.employee_management;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employee-client", url = "http://localhost:8081/api")
public interface EmployeeClient {
    @GetMapping("//{id}")
    List<Employee> findAllEmployeeByDepartmentId(@PathVariable int id);
    
}
