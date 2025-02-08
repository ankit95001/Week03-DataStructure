package day06algorithmruntimeanalysis.largefilereadingefficiency;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void usingFileReader(String path){
        Instant start = Instant.now();
        UsingFileReader fileRead = new UsingFileReader();
        fileRead.fileReader(path);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis() + " ms");
    }
    public static void usingInputStreamReader(String path){
        Instant start = Instant.now();
        UsingInputStreamReader fileRead = new UsingInputStreamReader();
        fileRead.inputStreamReader(path);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis() + " ms");
    }
    public static void main(String[] args) {
        String path1MB="src/day06algorithmruntimeanalysis/largefilereadingefficiency/text_file_1MB";
        String path10MB="src/day06algorithmruntimeanalysis/largefilereadingefficiency/text_file_10MB";
        String path100MB="src/day06algorithmruntimeanalysis/largefilereadingefficiency/text_file_100MB";

        System.out.println("Using File Reader Class It take time for 1MB, 10MB, and 100MB respectively : ");
        usingFileReader(path1MB);
        usingFileReader(path10MB);
        usingFileReader(path100MB);
        System.out.println("Using Input Stream Reader Class It take time for 1MB, 10MB, and 100MB respectively : ");
        usingInputStreamReader(path1MB);
        usingInputStreamReader(path10MB);
        usingInputStreamReader(path100MB);

    }
}
