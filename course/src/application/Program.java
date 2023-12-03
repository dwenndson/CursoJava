package course.src.application;

import java.util.Locale;
import java.util.Scanner;

import course.src.entites.Product;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProduct(sc.nextInt());

        System.out.println("Update data: ".concat(String.valueOf(product).replace("Product data: ", "")));

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProduct(sc.nextInt());

        System.out.println("Update data: ".concat(String.valueOf(product).replace("Product data: ", "")));

        sc.close();
    }
}