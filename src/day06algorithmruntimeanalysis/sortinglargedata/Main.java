package day06algorithmruntimeanalysis.sortinglargedata;


public class Main {
    public static long quickSortCheck(int[] arr){
        long startTime, endTime;
        startTime=System.nanoTime();
        QuickSort qs = new QuickSort(arr);
        qs.quickSort();
        endTime=System.nanoTime();
        return endTime-startTime;
    }
    public static long mergeSortCheck(int[] arr){
        long startTime, endTime;
        startTime=System.nanoTime();
        MergeSort ms = new MergeSort(arr);
        ms.mergeSort();
        endTime=System.nanoTime();
        return endTime-startTime;
    }
    public static long bubbleSortCheck(int[] arr){
        long startTime, endTime;
        startTime=System.nanoTime();
        BubbleSort bs = new BubbleSort(arr);
        bs.bubbleSort();
        endTime=System.nanoTime();
        return endTime-startTime;
    }
    public static void main(String[] args) {
        int[] arr1000 = new int[1000];
        int[] arr10000 = new int[10000];
        int[] arr1000000 = new int[1000000];

        for(int i=0;i<arr1000.length;i++){
            arr1000[i]=1000-i+1;
        }
        for(int i=0;i<arr10000.length;i++){
            arr10000[i]=10000-i+1;
        }
        for(int i=0;i<arr1000000.length;i++){
            arr1000000[i]=1000000-i+1;
        }

        System.out.println("Time taken for sorting 1000 size array using Bubble sort is : "+bubbleSortCheck(arr1000.clone()));
        System.out.println("Time taken for sorting 1000 size array using Merge sort is : "+mergeSortCheck(arr1000.clone()));
        System.out.println("Time taken for sorting 1000 size array using Quick sort is : "+quickSortCheck(arr1000.clone()));


        System.out.println("Time taken for sorting 10000 size array using Bubble sort is : "+bubbleSortCheck(arr10000.clone()));
        System.out.println("Time taken for sorting 10000 size array using Merge sort is : "+mergeSortCheck(arr10000.clone()));
        System.out.println("Time taken for sorting 10000 size array using Quick sort is : "+quickSortCheck(arr10000.clone()));


        System.out.println("Time taken for sorting 1000000 size array using Bubble sort is : "+bubbleSortCheck(arr1000000.clone()));
        System.out.println("Time taken for sorting 1000000 size array using Merge sort is : "+mergeSortCheck(arr1000000.clone()));
        System.out.println("Time taken for sorting 1000000 size array using Quick sort is : "+quickSortCheck(arr1000000.clone()));




    }
}
