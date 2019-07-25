package Zad7;

public class Calculator {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i] = i+1;
        }
        int number = 2518;
        int check = 0;
        do{


            for (int i = 0; i <array.length; i++){
               // System.out.println(num);
                if (number%array[i]==0) check++;

            }number++;
            check=0;
        }while (check==10);
        System.out.println(number);
        System.out.println(check);
        //boolean check;

//        while (check){
//            for (int i = 0; i <array.length; i++){
//                if(number%array[i]==0)
//            }
//        }
    }
}
