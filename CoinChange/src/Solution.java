public class Solution {

    /**
     * @param denoms The value of the coins in ascending order.
     * @param target The amount to convert to coins.
     * @return Returns a string of the needed coins to get the target.
     */

    public StringBuilder minCoinDenoms(int[] denoms, int target){
        StringBuilder ans = new StringBuilder("\n");

        for (int i: denoms){

            if(target < i)
                continue;

            int div = target / i;
            ans.append(" ").append(div).append("-").append(i).append(" Ksh coin(s). \n");

            target = target % i;

            if(target == 0)
                break;

        }

        return ans;
    }


    public int coinChange(int[] coins, int amount) {
        int div = 0;
        int len = coins.length;
        for(int i = len - 1; i >= 0; i--){
            if(coins[i] > amount){
                continue;
            }
            div = div + (amount / coins[i]);


        }

        return 0;
    }

}
