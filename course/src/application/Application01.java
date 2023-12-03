package course.src.application;

import java.util.Scanner;

import course.src.entites.Rectangle;

public class Application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Rectangle rt = new Rectangle();

        System.out.print("Enter rectangle width and height: ");
        rt.height = sc.nextDouble();
        rt.width = sc.nextDouble();

        System.out.println("AREA: ".concat(String.valueOf(rt.Area())));
        System.out.println("PERIMETER: ".concat(String.valueOf(rt.Perimeter())));
        System.out.println("DIAGONAL: ".concat(String.valueOf(rt.diagonal())));
    }
}