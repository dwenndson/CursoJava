package course.src.application;
import java.util.Scanner;

import course.src.entites.CurrencyConverter;

public class Application04Static {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double buyDollar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.convert(dollarPrice, buyDollar));
    }
}
