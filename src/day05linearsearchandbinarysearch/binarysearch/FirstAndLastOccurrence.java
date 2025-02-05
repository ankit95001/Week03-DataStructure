package day05linearsearchandbinarysearch.binarysearch;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };;
        int target = 2;
        int firstOccurrence = getFirstOccurrence(arr,target);
        int lastOccurrence = getlastOccurrence(arr,target);

        System.out.printf("The first occurrence of \"%d\" is at %d and last at %d%n",target,firstOccurrence,lastOccurrence);
    }

    private static int getlastOccurrence(int[] arr, int target) {
        int low=0,high=arr.length-1,result=-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]<target){
                low=mid+1;
            } else if(arr[mid]>target) {
                high=mid-1;
            }else{
                result=mid;
                low=mid+1;
            }
        }
        return result;
    }

    private static int getFirstOccurrence(int[] arr, int target) {
        int low=0, high=arr.length-1,result=-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]<target){
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                result=mid;
                high=mid-1;
            }
        }
        return result;
    }
}
