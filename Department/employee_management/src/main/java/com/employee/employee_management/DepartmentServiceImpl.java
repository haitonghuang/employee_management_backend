package com.employee.employee_management;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;
    EmployeeClient employeeClient;


    @Override
    public List<Department> findAllDepartments(){
        return departmentRepository.findAll();
    }

    @Override
    public Department findDepartmentById(int id){
        return departmentRepository.findById(id).orElse(Department.builder().department("NOT_FOUND").build());
    }

    @Override
    public void addDepartment(Department department){
        departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(int department_id){
        departmentRepository.deleteById(department_id);
    }

    @Override
    public void updateDepartment(int id, Department department){
        List<Department> departmentList = this.findAllDepartments();
        Department updatedDept = departmentList.stream().filter((deprt -> deprt.getId() == id)).collect(Collectors.toList()).get(0);
        updatedDept.setDepartment(department.getDepartment());
        this.addDepartment(updatedDept);
    }

    @Override
    public DepartmentInfoDTO findAllEmployeeByDepartmentId(int id){
      var department = this.findDepartmentById(id);
      var employeeList = employeeClient.findAllEmployeeByDepartmentId(id);
      return DepartmentInfoDTO.builder().department(department.getDepartment()).employees(employeeList).build();
    }
    

    
}

