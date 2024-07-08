public class Main {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

       Solution.mergeSort(array);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}