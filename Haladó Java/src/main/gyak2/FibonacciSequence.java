package main.gyak2;

public class FibonacciSequence {
    public static int getWithRecursion(int n) {
        if (n <= 1){
            return n;
        }
        return getWithRecursion(n - 1) + getWithRecursion(n - 2);
    }

    public static int getWithIteration(int n) {

        int numberOne = 0;
        int numberTwo = 1;
        int numberThree = 0;
        int counter = 0;

        while (counter < n) {
            numberThree = numberTwo + numberOne;
            numberOne = numberTwo;
            numberTwo = numberThree;
            counter++;
        }

        return numberOne;
    }
}
