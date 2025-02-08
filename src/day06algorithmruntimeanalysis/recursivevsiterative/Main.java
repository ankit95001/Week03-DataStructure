package day06algorithmruntimeanalysis.recursivevsiterative;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void fibonacciIterative(long n){
        Instant start = Instant.now();
        FibonacciIterative fi = new FibonacciIterative();
        long result = fi.fibonacciIterative(n);
        Instant end = Instant.now();
        System.out.println("Fibonacci series for "+n+" elements are :"+result);
        System.out.println(Duration.between(start, end).toMillis() + " ms");
    }
    public static void fibonacciRecursive(long n){
        Instant start = Instant.now();
        FibonacciRecursive fr = new FibonacciRecursive();
        long result = fr.fibonacciRecursive(n);
        Instant end = Instant.now();
        System.out.println("Fibonacci series for "+n+" elements are :"+result);
        System.out.println(Duration.between(start, end).toMillis() + " ms");
    }
    public static void main(String[] args) {
        System.out.println("Time taken to calculate Fibonacci using Iterative for 10, 30, 50 element are ");
        fibonacciIterative(10);
        fibonacciIterative(30);
        fibonacciIterative(50);

        System.out.println("Time taken to calculate Fibonacci using Recursive for 10, 30, 50 element are ");
        fibonacciRecursive(10);
        fibonacciRecursive(30);
        fibonacciRecursive(50);
    }
}
