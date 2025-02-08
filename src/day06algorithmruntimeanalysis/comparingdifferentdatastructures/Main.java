package day06algorithmruntimeanalysis.comparingdifferentdatastructures;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        for (int size : sizes) {
            System.out.println("\nTesting for N = " + size);

            // Generate Data
            int[] array = DataGenerator.generateArray(size);
            HashSet<Integer> hashSet = DataGenerator.generateHashSet(array);
            TreeSet<Integer> treeSet = DataGenerator.generateTreeSet(array);

            int searchKey = array[size / 2];

            // Measure time for Array search
            long start = System.nanoTime();
            ArraySearch.search(array, searchKey);
            long end = System.nanoTime();
            System.out.println("Array Search Time: " + (end - start) / 1_000_000.0 + " ms");

            // Measure time for HashSet search
            start = System.nanoTime();
            HashSetSearch.search(hashSet, searchKey);
            end = System.nanoTime();
            System.out.println("HashSet Search Time: " + (end - start) / 1_000_000.0 + " ms");

            // Measure time for TreeSet search
            start = System.nanoTime();
            TreeSetSearch.search(treeSet, searchKey);
            end = System.nanoTime();
            System.out.println("TreeSet Search Time: " + (end - start) / 1_000_000.0 + " ms");
        }
    }
}
