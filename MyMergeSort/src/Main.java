public class Main {
    public static void main(String[] args) {
        int[] arr = {7,2,24,1,78,90,3,56,23,12,71,45,5};

        Solution solution = new Solution();
        solution.mergeSort(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }

    }
}