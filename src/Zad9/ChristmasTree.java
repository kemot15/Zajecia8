package Zad9;

import java.util.Scanner;

public class ChristmasTree {
    public void printTree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe poziomow");
        int level = scanner.nextInt();
        scanner.nextLine();
        for (int i = level-1; i>=0; i--){
            int stars = (level-i)*2-1;
            for (int j = 0; j<i; j++)
                System.out.print(" ");
            for (int j = 0; j<stars; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
