package Zad5;

public class Rand {
    private int sum = 0;
    public void avg (int[] array){
        for (int number : array){
            sum+=number;
        }
        sum = sum/array.length;
        System.out.println("Srednia wynosi: " + sum);
    }

    public void lower (int[] array){
        int lowSum = 0;
        for (int number: array){
            if (number<sum)
                lowSum += number;
        }
        System.out.println("Suma liczb mniejszych niz sradnia: " + lowSum);
    }

    public void higher (int[] array){
        int highSum = 0;
        for (int number: array){
            if (number>sum)
                highSum += number;
        }
        System.out.println("Suma liczb wiekszych niz sradnia: " + highSum);
    }
}
