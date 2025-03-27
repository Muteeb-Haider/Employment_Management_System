/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employmentsystem;

/**
 *
 * @author mianm
 */
import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Employee> employees;
    private List<Employer> employers;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.employers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void addEmployer(Employer employer) {
        if (!employers.contains(employer)) {
            employers.add(employer);
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Employer> getEmployers() {
        return new ArrayList<>(employers);
    }

    @Override
    public String toString() {
        return "Company: " + name + " with " + employees.size() + " employees and " + employers.size() + " employers";
    }
}
