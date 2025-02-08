package day06algorithmruntimeanalysis.recursivevsiterative;

public class FibonacciRecursive {
    public long fibonacciRecursive(long n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
