/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employmentsystem;

/**
 *
 * @author mianm
 */
import java.time.LocalDate;
public class EmploymentSystem {
    public static void main(String[] args) {
        Company techCorp = new Company("Tech Corp");
        Employer ceo = new Employer("John Smith", techCorp);
        Person p1 = new Person("Alice Johnson");
        ceo.hireEmployee(p1, "Software Developer", 85000.0, LocalDate.of(2023, 1, 15));
        Employee emp2 = new Employee("Bob Wilson", "Product Manager", 95000.0, LocalDate.of(2022, 6, 1), techCorp);

        System.out.println(techCorp);
        System.out.println(ceo);
        System.out.println(emp2);

        System.out.println("\nEmployees of " + techCorp.getName() + ":");
        for (Employee emp : techCorp.getEmployees()) {
            System.out.println(emp);
        }
    }
}
