package com.employee.employee_management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true", methods = { RequestMethod.GET,
        RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class EmployeeController {
    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/create")
    public void addEmployee(@RequestBody Employee employee) {
        employeeServiceImpl.addEmployee(employee);
        // return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public Employee getEmployeeById(@PathVariable long id) {
        // Optional<Employee> employee =
        // Optional.of(employeeServiceImpl.findEmployeeById(id));
        // if(!employee.isPresent()){
        // throw new ResourceNotFoundException("Employee Not Found");
        // }
        // return ResponseEntity.ok(employee.get());
        return employeeServiceImpl.findEmployeeById(id);

    }

    @GetMapping("/")
    public List<Employee> getAllEmployee() {
        // Optional<Employee> employee =
        // Optional.of(employeeServiceImpl.findEmployeeById(id));
        // if(!employee.isPresent()){
        // throw new ResourceNotFoundException("Employee Not Found");
        // }
        // return ResponseEntity.ok(employee.get());
        return employeeServiceImpl.findAllEmployees();

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable long id) {
        employeeServiceImpl.removeEmployeeById(id);
        // return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        employeeServiceImpl.updateEmployee(id, employee);

    }

}
