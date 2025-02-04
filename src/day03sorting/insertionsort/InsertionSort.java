package day03sorting.insertionsort;

class InsertionSort {
    static void sortEmployeeIDs(int[] ids) {
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i], j = i;
            while (j > 0 && ids[j - 1] > key) {
                ids[j] = ids[j - 1];
                j--;
            }
            ids[j] = key;
        }
    }

    public static void main(String[] args) {
        int employee_id[] = {101,105,99,95,1025,102,58,10};
        sortEmployeeIDs(employee_id);
        for(int i:employee_id){
            System.out.print(i+" ");
        } 
    }
}
