package course.src.application;

import java.util.Scanner;

import course.src.entites.Employer;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employer employee = new Employer();

        System.out.print("Employee: ");
        employee.name = scanner.nextLine();
        employee.salary = scanner.nextDouble();
        System.out.println("Employee: " + employee);
        System.out.print("Which percentage to increase salary: ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee);
    }
}
