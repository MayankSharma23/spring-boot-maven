package com.example.springbootmaven.Models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "employee")
public class EmployeeModel {

    @Id
    //@GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "emp_id")
    private UUID empId;

    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_email")
    private String empEmail;

    @Column(name = "emp_salary")
    private long empSalary;

    @Column(name = "emp_city")
    private String empCity;

    @Column(name = "emp_department")
    private String empDepartment;

    public UUID getEmpId() {
        return empId;
    }

    public void setEmpId(UUID empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empSalary=" + empSalary +
                ", empCity='" + empCity + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                '}';
    }
}
