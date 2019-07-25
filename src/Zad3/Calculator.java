package Zad3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("podaj a");
            a= scanner.nextInt();
            scanner.nextLine();
        }while (a==0);

        System.out.println("Podaj b");
        b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj c");
        c = scanner.nextInt();
        scanner.nextLine();

        int x = (c-b)/a;
        System.out.println("wynik rownania: " + x);
    }
}
