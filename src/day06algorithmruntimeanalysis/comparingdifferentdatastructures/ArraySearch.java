package day06algorithmruntimeanalysis.comparingdifferentdatastructures;

class ArraySearch {
    public static boolean search(int[] array, int key) {
        for (int num : array) {
            if (num == key) return true;
        }
        return false;
    }
}
