package JavaConcept;

import java.util.Arrays;

public class Fibonacci extends Thread  {
    public static void main(String[] args) {
//        int n = 10; // Change this value to calculate Fibonacci sequence up to a different number
//
//        System.out.print("Fibonacci sequence up to " + n + ": ");
//        for (int i = 0; i < n; i++) {
//            //System.out.print(fibonacci(i) + " ");
//        }
//
//        System.out.println();
//
//        System.out.print("Fibonacci sequence up to " + n + ": ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacciNew(i) + " ");


    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;

        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static double fibonacciNew(int n) {
        System.out.println(Arrays.stream(ThreadLocal.class.getClasses()).findFirst());

        return (double) ((double) (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
    }
}

final class Test1 extends Fibonacci{

}