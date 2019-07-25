package Zad4;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i<100; i++){
            if (i%3==00 && i%5==0)
                System.out.println(i + " FizzBuzz");
            else if (i%3 == 0)
                System.out.println(i + " Fizz");
            else if (i%5 == 0)
                System.out.println(i + " Buzz");
        }
    }
}
