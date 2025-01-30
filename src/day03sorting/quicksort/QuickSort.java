package day03sorting.quicksort;

class QuickSort {
    static void sortProductPrices(int[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);
            sortProductPrices(prices, low, pi - 1);
            sortProductPrices(prices, pi + 1, high);
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

    public static void main(String[] args) {
        int prices[] = {25, 35, 45, 15, 2, 102, 10, 25};

        sortProductPrices(prices, 0, prices.length - 1);

        for (int i : prices) {
            System.out.print(i + " ");
        }
    }
}
