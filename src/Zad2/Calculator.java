package Zad2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        x = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        if (Math.pow(x,2)>100) {
            sum += x;
        }else{
            sum = sum%2;
        }
        System.out.println(sum);

    }
}
