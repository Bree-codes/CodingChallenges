public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] array = {40, 20, 10, 5, 1};
        int target = 223;
        String ans = solution.minCoinDenoms(array, target);

        System.out.println(ans);
    }
}