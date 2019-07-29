package Zad9;

import java.util.Scanner;

public class ChristmasTree {
    public void paintTree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe poziomow");
        int level = scanner.nextInt();
        scanner.nextLine();
        String[][] tree = new String[level][];
        level = (level-1)*2+1;
        for (int i = tree.length-1; i >= 0; i++){
            tree[i][] = new tree[i][level];
        }
    }
}
