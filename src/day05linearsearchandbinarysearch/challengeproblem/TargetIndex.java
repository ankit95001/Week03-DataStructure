package day05linearsearchandbinarysearch.challengeproblem;

public class TargetIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int result = getIndex(arr,target);
        System.out.printf("The index of \"%d\" in this array is : %d%n",target,result);
    }

    private static int getIndex(int[] arr, int target) {
        int low=0,high= arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
