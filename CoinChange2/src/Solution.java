import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array1 = {1, 2, 5};
        int target1 = 11;
        int answer1 = solution.coinChange(array1, target1);
        System.out.println(answer1 + " is the minimum number of coins.");

        int[] array2 = {186, 419, 83, 408};
        int target2 = 6249;
        int answer2 = solution.coinChange(array2, target2);
        System.out.println(answer2 + " is the minimum number of coins.");
    }
}
