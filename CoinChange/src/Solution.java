import java.util.Arrays;

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
        sort(coins);
        System.out.println(Arrays.toString(coins));
        int div = 0;
        int len = coins.length;
        for(int i = len - 1; i >= 0; i--){
            if(coins[i] > amount){
                continue;
            }
            div = div + (amount / coins[i]);
            amount = amount % coins[i];

            if(amount == 0){
                break;
            }
        }
        if(amount != 0)
          return -1;

        return div;
    }


    private void sort(int[] arr){
        int len = arr.length;

        if(len == 1)
            return;

        len = len-1;

        int lenLeftArr = len/2;
        int lenRightArr = len - lenLeftArr;

        int[] leftArr = new int[lenLeftArr+1];
        int[] rightArr = new int[lenRightArr];

        System.arraycopy(arr, 0, leftArr, 0, lenLeftArr+1);
        System.arraycopy(arr, lenLeftArr+1, rightArr, 0, lenRightArr);

        sort(leftArr);
        sort(rightArr);

        merge(arr, leftArr, rightArr);
    }


    private void merge(int[] parent, int[] leftChild, int[] rightChild){
        int i = 0, j = 0, k = 0;

        while(i < leftChild.length && j < rightChild.length){
            if(leftChild[i] < rightChild[j]) {
                parent[k] = leftChild[i];
                k++;
                i++;
            }else {
                parent[k] = rightChild[j];
                k++;
                j++;
            }
        }

        while (i < leftChild.length){
            parent[k] = leftChild[i];
            k++;
            i++;
        }

        while (j < rightChild.length){
            parent[k] = rightChild[j];
            k++;
            j++;
        }
    }

}
