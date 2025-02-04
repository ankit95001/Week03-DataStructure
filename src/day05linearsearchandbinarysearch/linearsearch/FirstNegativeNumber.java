package day05linearsearchandbinarysearch.linearsearch;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {5,6,-1,5,4,-3,-8};

        int index = getNegativeIndex(arr);

        System.out.println("The first negative index in this array is at "+(index+1)+" position.");

    }

    private static int getNegativeIndex(int[] arr) {
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }
}
