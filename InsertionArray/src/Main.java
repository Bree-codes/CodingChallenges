import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {91,82,74,65,56,47};
        Solution solution = new Solution();
        int[] n = solution.insertIntoSortedArray(arr,60,false);
        System.out.println(Arrays.toString(n));
    }
}