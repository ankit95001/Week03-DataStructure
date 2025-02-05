package day05linearsearchandbinarysearch.challengeproblem;

public class FirstMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        int result = getMissingNumber(arr);
        System.out.println("First missing positive integer is : "+result);
    }

    private static int getMissingNumber(int[] arr) {
        int size = getMaxNumber(arr)+1;
        int[] newArr = new int[size];
        for(int i:arr){
            if(i<0){
                continue;
            }
            newArr[i]++;
        }
        int i;
        for(i=1;i<newArr.length;i++){
            if(newArr[i]==0){
                return i;
            }
        }
        return i;
    }

    private static int getMaxNumber(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
}
