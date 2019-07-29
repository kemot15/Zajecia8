package Zad8;

public class Power {

    public int checkNumbers (){
        int globalSum = 0;
        for (int i = 2; i<999999; i++){
            int number = i;
            int sum = 0;
            for (int j = 100000; j>0; j/=10){
                int rest = number%j;
                number = (number - rest)/j;
                sum += (int)Math.pow(number, 5);
                number = rest;
            }
            if (i == sum) {
                System.out.println(i);
                globalSum += i;
            }
        }
        return globalSum;
    }
}
