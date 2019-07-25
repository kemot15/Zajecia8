package Zad5;

import java.util.Random;

public class RandTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        Rand rand = new Rand();

        for (int i =0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }

        for (int num: array) {
            System.out.print(num + " ");
        }

        System.out.println();
        rand.avg(array);
        rand.lower(array);
        rand.higher(array);

    }

}
