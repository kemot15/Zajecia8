package Zad6;

import java.util.Arrays;

public class PalindromTest {
    public static void main(String[] args) {
        Pali pal = new Pali();
        int[] array = {1,3,4,3,1};
        System.out.println("Tablica " + Arrays.toString(array) + " jest palindromem " + (pal.checkArray(array)?"tak":"nie"));
    }
}


