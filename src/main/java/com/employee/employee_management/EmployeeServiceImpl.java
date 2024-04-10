package com.employee.employee_management;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
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
        Optional<Employee> opt = employeeRepository.findById(id);
        if(opt.isPresent()){
            return opt.get();
        }else{
            return null;
        }

    }
    @Override
    public void addEmployee(Employee employee){
        // ArrayList<Employee> emp = new ArrayList<Employee>();
        // emp.add(new Employee("John Doe", "john@gmail.com", "Project Manager", "Marketing", "514-695-8003"));
        // emp.add(new Employee("Leland J Thomas","ian.ohara2012@yahoo.com","Psychiatric Aide","Healthcare","551-200-1885"));
        // emp.add(new Employee("Anne W Hobbs", "aleandro2009@yahoo.com", "Ophthalmologist","Healthcare", "919-624-8193"));
        // emp.add(new Employee("Shawn J Smith", "yesenia2012@yahoo.com", "Teacher Assistant", "Education", "612-201-3453"));
        // for (Employee employee : emp) {
            employeeRepository.save(employee);
        
    }
    @Override
    public void removeEmployeeById(long id){
        employeeRepository.deleteById(id);
    }
    
}
