package day05linearsearchandbinarysearch.binarysearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        int result = findPeakElement(arr);

        System.out.println("The peak element is : "+ result);
    }

    private static int findPeakElement(int[] arr) {
        int low=0, high = arr.length-1;

        while(low<high){
            int mid = low+(high-low)/2;
            if(mid > 0 && mid <arr.length-1){
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    return arr[mid];
                }else if(arr[mid]<arr[mid-1]){
                    high=mid;
                }else{
                    low=mid+1;
                }
            }else if(mid == 0){
                return Math.max(arr[0], arr[1]);
            }else if(mid == arr.length-1){
                return Math.max(arr[arr.length-1],arr[arr.length-2]);
            }
        }
        return arr[low];
    }
}
