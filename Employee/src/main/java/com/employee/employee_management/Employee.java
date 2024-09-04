package com.employee.employee_management;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "full_name")
    private String fullName;
    private String email;
    private String title;
    @Column(name = "department_id")
    private int departmentId;
    private String department;
    @Column(name = "phone_no")
    private String phoneNumber;

    // public Employee() {
    // }

    // public Employee(String fullName, String email, String jobTitle, String department, String phoneNumber) {
    //     this.fullName = fullName;
    //     this.email = email;
    //     this.title = jobTitle;
    //     this.department = department;
    //     this.phoneNumber = phoneNumber;
    // }

    // public long getId() {
    //     return id;
    // }

    // public void setId(long id) {
    //     this.id = id;
    // }

    // public String getFullName() {
    //     return fullName;
    // }

    // public void setFullName(String fullName) {
    //     this.fullName = fullName;
    // }

    // public String getEmail() {
    //     return email;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    // public String getTitle() {
    //     return title;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public String getDepartment() {
    //     return department;
    // }

    // public void setDepartment(String department) {
    //     this.department = department;
    // }

    // public String getPhoneNumber() {
    //     return phoneNumber;
    // }

    // public void setPhoneNumber(String phoneNumber) {
    //     this.phoneNumber = phoneNumber;
    // }
}
