package day05linearsearchandbinarysearch.binarysearch;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{3, 30, 38},
                        {20, 52, 54},
                        {35, 60, 69}};

        int target = 60;

        int[] position = findTarget(arr,target);

        System.out.printf("The position of \"%d\" in array is : [%d][%d]%n",target,position[0],position[1]);
    }

    private static int[] findTarget(int[][] arr, int target) {
        int low=0, high= arr.length*arr[0].length -1;
        while(low<high){
            int mid = low+(high-low)/2;
            int row = mid/arr[0].length, column= mid%arr[0].length;
            if(arr[row][column]==target){
                return new int[] {row,column};
            }else if(arr[row][column]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[] {-1,-1};
    }

}
