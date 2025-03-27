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
class Employer extends Person {
    private Company company;

    public Employer(String name, Company company) {
        super(name);
        this.company = company;
        company.addEmployer(this);
    }

    public void hireEmployee(Person person, String role, double salary, LocalDate startDate) {
        if (company != null) {
            Employee newEmployee = new Employee(person.getName(), role, salary, startDate, company);
            company.addEmployee(newEmployee);
        }
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employer: " + getName() + " of " + company.getName();
    }
}