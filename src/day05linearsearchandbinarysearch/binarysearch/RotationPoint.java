package day05linearsearchandbinarysearch.binarysearch;

public class RotationPoint {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        int rotationPoint = findRotationPoint(arr);

        System.out.println("Index of the smallest element is : "+rotationPoint);

    }

    private static int findRotationPoint(int[] arr) {
        int low=0, high=arr.length-1;
        while(low<high){
            int mid  = low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}
