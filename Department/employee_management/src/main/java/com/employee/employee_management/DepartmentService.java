package com.employee.employee_management;

import java.util.List;

public interface DepartmentService {
    List<Department> findAllDepartments();
    void addDepartment(Department department);
    Department findDepartmentById(int id);
    void deleteDepartment(int department_id);
    void updateDepartment(int id, Department department);
    DepartmentInfoDTO findAllEmployeeByDepartmentId(int id);

}
