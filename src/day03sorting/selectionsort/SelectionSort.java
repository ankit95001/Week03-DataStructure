package day03sorting.selectionsort;

class SelectionSort {
    static void sortExamScores(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) minIndex = j;
            }
            if (minIndex != i) {
                scores[i] ^= scores[minIndex];
                scores[minIndex] ^= scores[i];
                scores[i] ^= scores[minIndex];
            }
        }
    }

    public static void main(String[] args) {
        int examScores[] = {95,25,41,75,96,57,54,51,2};

        sortExamScores(examScores);

        for(int i:examScores){
            System.out.print(i+" ");
        }
    }
}
