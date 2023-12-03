package course.src.application;
import java.util.Scanner;

import course.src.entites.Student;

public class Application03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter name and notes: ");
        student.name = sc.nextLine();
        student.n1  = sc.nextDouble();
        student.n2  = sc.nextDouble();
        student.n3  = sc.nextDouble();

        System.out.println(student.finalNota());
    }
}
