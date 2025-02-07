package day06algorithmruntimeanalysis.comparetheperformanceoflinearsearchandbinarysearch;

public class BinarySearch {
    private int[] arr;
    BinarySearch(int[] arr){
        this.arr=arr;
    }
    public boolean binarySearch(int key){
        int low=0, high=arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]==key){
                return true;
            }else if(arr[mid]>key){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }

}
