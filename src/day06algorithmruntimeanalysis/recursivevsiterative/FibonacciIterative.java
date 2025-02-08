package day06algorithmruntimeanalysis.recursivevsiterative;

public class FibonacciIterative {
    public long fibonacciIterative(long n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
