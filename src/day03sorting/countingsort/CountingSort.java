package day03sorting.countingsort;

class CountingSort {
    static void sortAges(int[] ages) {
        int max = 18, min = 10, range = max - min + 1;
        int[] count = new int[range];
        for (int age : ages) {
            count[age - min]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        int[] sorted = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            sorted[--count[ages[i] - min]] = ages[i];
        }
        System.arraycopy(sorted, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int ages[] = {18,15,10,16,12,11,17};

        sortAges(ages);

        for(int age : ages){
            System.out.print(age+" ");
        }
    }
}
