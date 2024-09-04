package com.employee.employee_management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@RequiredArgsConstructor
@RestController
@RequestMapping("api/departments")
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return departmentService.findAllDepartments();
    }

    @GetMapping("/employees-by-department/{id}")
    public DepartmentInfoDTO findAllEmployeesByDepartment(@PathVariable int id) {
        return departmentService.findAllEmployeeByDepartmentId(id);
    }
    


    


}
