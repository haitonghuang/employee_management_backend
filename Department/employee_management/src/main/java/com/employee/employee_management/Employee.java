package com.employee.employee_management;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    private long id;
    private String fullName;
    private String title;
    private String email;

}
