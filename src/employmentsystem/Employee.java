/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employmentsystem;

/**
 *
 * @author mianm
 */
import java.time.LocalDate;

class Employee extends Person {
    private String role;
    private double salary;
    private LocalDate startDate;
    private Company company;

    public Employee(String name, String role, double salary, LocalDate startDate, Company company) {
        super(name);
        this.role = role;
        this.salary = salary;
        this.startDate = startDate;
        this.company = company;
        if (company != null) {
            company.addEmployee(this);
        }
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee: " + getName() + ", Role: " + role + ", Salary: " + salary + ", Start Date: " + startDate;
    }
}
