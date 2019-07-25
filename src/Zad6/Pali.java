package Zad6;

public class Pali {
    public boolean checkArray (int[] array){
        int lastElement = array.length -1;
        boolean checkPalindrom = true;
        int i = 0;
        while (checkPalindrom && i<array.length) {
            if (array[i] == array[lastElement]){
                i++;
                lastElement--;
            }
            else checkPalindrom = false;
        }
        return checkPalindrom;
    }
}
