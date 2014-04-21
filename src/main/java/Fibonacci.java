/**
 * Created by wnelson on 4/21/14.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Printing Fibonacci numbers");
        System.out.println(0);
        printFibonacciNumbers(0, 1);
    }

    private static void printFibonacciNumbers(int i, int j) {
        if (j < 1000) {
            System.out.println(i+j);
            printFibonacciNumbers(j, (i+j));
        }
    }
}
