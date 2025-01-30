package day03sorting.mergesort;

class MergeSort {
    static void sortBookPrices(int[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sortBookPrices(prices, left, mid);
            sortBookPrices(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }
    private static void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];
        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, l, temp.length);
    }

    public static void main(String[] args) {
        int prices[]={25,10,250,124,100,52,59};

        sortBookPrices(prices,0,prices.length-1);

        for(int i:prices){
            System.out.print(i+" ");
        }
    }
}
