package com.employee.employee_management;

import java.util.ArrayList;

public interface EmployeeService {
    ArrayList<Employee> findAllEmployees();

    Employee findEmployeeById(long id);

    void addEmployee(Employee employee);

    void removeEmployeeById(long id);

    void updateEmployee(long id, Employee employee);
}
