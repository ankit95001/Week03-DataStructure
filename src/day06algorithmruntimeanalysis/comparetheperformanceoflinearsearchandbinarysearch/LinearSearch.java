package day06algorithmruntimeanalysis.comparetheperformanceoflinearsearchandbinarysearch;

public class LinearSearch {
    int[] arr;
    LinearSearch(int[] arr){
        this.arr=arr;
    }
    public boolean linerSearch(int key){
        for(int i:arr){
            if(i==key){
                return true;
            }
        }
        return false;
    }
}
