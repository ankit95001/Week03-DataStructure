package day03sorting.bubblesort;

class BubbleSort {
    static void sortMarks(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    marks[j] ^= marks[j + 1];
                    marks[j + 1] ^= marks[j];
                    marks[j] ^= marks[j + 1];
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int student_marks[] = {10,20,50,90,80,67,5,100,25};

        sortMarks(student_marks);
        for(int i:student_marks){
            System.out.print(i+" ");
        }
    }
}
