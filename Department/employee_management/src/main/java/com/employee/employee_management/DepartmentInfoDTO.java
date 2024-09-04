package com.employee.employee_management;

import java.util.List;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentInfoDTO {
    private String department;
    private List<Employee> employees; 
}
