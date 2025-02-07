package day06algorithmruntimeanalysis.sortinglargedata;

public class BubbleSort {
    private int[] arr;
    BubbleSort(int[] arr){
        this.arr=arr;
    }
    void bubbleSort() {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
