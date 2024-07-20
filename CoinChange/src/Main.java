public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] array = {186,419,83,408};
        int target = 11;


        String ans = String.valueOf(solution.minCoinDenoms(array, target));
        System.out.println(ans);

        int answer = solution.coinChange(array,target);
        System.out.println(answer);
    }
}