package day06algorithmruntimeanalysis.stringconcatenationperformance;

import java.time.Duration;
import java.time.Instant;

public class Comparison {
    public static void usingString(int N){
        Instant start = Instant.now();
        String str = "";
        for (int i = 0; i < N; i++) {
            str += "a";
        }
        Instant end = Instant.now();
        System.out.println("String concatenation time: " + Duration.between(start, end).toMillis() + " ms");
    }
    public static void usingStringBuilder(int N){
        Instant start = Instant.now();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a"); // Efficient (O(N))
        }
        Instant end = Instant.now();
        System.out.println("StringBuilder concatenation time: " + Duration.between(start, end).toMillis() + " ms");
    }
    public static void usingStringBuffer(int N){
        Instant start = Instant.now();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append("a"); // Thread-safe, slightly slower than StringBuilder (O(N))
        }
        Instant end = Instant.now();
        System.out.println("StringBuffer concatenation time: " + Duration.between(start, end).toMillis() + " ms");
    }
    public static void main(String[] args) {
        usingString(1000);
        usingStringBuffer(1000);
        usingStringBuilder(1000);
        System.out.println("-----------------------------------------------------------");
        usingString(10000);
        usingStringBuffer(10000);
        usingStringBuilder(10000);
        System.out.println("-------------------------------------------------------------");
        usingString(1_000_000);
        usingStringBuffer(1_000_000);
        usingStringBuilder(1_000_000);

    }
}
