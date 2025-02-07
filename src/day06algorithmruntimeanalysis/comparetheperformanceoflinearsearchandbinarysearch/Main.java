package day06algorithmruntimeanalysis.comparetheperformanceoflinearsearchandbinarysearch;

public class Main {
    public static long linerSearch(int[] arr, int key){
        long startTime, endTime;
        startTime=System.nanoTime();
        LinearSearch ls = new LinearSearch(arr);
        System.out.println("Item found : "+ls.linerSearch(key));
        endTime=System.nanoTime();

        return endTime-startTime;
    }
    public static long binarySearch(int[] arr, int key){
        long startTime, endTime;
        startTime=System.nanoTime();
        BinarySearch bs = new BinarySearch(arr);
        System.out.println("Item found : "+bs.binarySearch(key));
        endTime=System.nanoTime();

        return endTime-startTime;
    }
    public static void main(String[] args) {
        int[] arr1000 = new int[1000];
        int[] arr10000 = new int[10000];
        int[] arr1000000 = new int[1000000];

        for(int i=0;i<arr1000.length;i++){
            arr1000[i]=i+1;
        }
        for(int i=0;i<arr10000.length;i++){
            arr10000[i]=i+1;
        }
        for(int i=0;i<arr1000000.length;i++){
            arr1000000[i]=i+1;
        }

        System.out.println("Time taken for searching in 1000 size array using Linear Search is : "+linerSearch(arr1000,1000));
        System.out.println("Time taken for searching in 1000 size array using Binary Search is : "+binarySearch(arr1000,1000));

        System.out.println("Time taken for searching in 10000 size array using Linear Search is : "+linerSearch(arr10000,10000));
        System.out.println("Time taken for searching in 10000 size array using Binary Search is : "+binarySearch(arr10000,10000));

        System.out.println("Time taken for searching in 1000000 size array using Linear Search is : "+linerSearch(arr1000000,1000000));
        System.out.println("Time taken for searching in 1000000 size array using Binary Search is : "+binarySearch(arr1000000,1000000));




    }
}
