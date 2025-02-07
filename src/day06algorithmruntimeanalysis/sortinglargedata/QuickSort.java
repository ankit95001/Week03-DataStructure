package day06algorithmruntimeanalysis.sortinglargedata;

public class QuickSort {
    private int[] arr;
    QuickSort(int[] arr){
        this.arr=arr;
    }
    void quickSort(){
        sort(arr,0,arr.length-1);
    }
    private void sort(int[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);
            sort(prices, low, pi - 1);
            sort(prices, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i++, j);
            }
        }
        swap(arr, i, high);
        return i;
    }

    // Fixed swap function using a temporary variable
    private static void swap(int[] arr, int i, int j) {
        if (i != j) {  // Avoid XOR swap issue when i == j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
