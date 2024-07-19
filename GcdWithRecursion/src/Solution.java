public class Solution {


    /**
     *
     * @param a first number to find the GCD.
     * @param b second number to find the GCD.
     * @return the method return the gcd of the 2 numbers when the base case it met.
     */
    public int greatestCommonDivisor(int a, int b) {
        if (b == 0)
            return a;

        return greatestCommonDivisor(b, a % b);
    }


    /**
     *
     * @param a Array of number to find the GCD for.
     * @param i First prime number =>  value : 2
     * @param gcd Initial GCD value => value : 1
     * @return The method return an int the value of the gcd of the numbers in the array a.
     */
    public int GCD(int[] a, int i, int gcd) {
        int[] arr = new int[ a.length];

            if(isPrime(i)){
                int k = 0;
                for(int num: a){
                    if(i > num)
                        return gcd;

                    if(num % i != 0)
                        return GCD(a, i+1, gcd);

                    arr[k] = num / i;
                    k++;
                }
                return GCD(arr, i, gcd*i);
            }else
               return GCD(a, i+1, gcd);
    }


    /**
     *
     * @param i Number to check whether it is prime.
     * @return The method returns  a boolean.
     */
    public boolean isPrime(int i){
        for (int j = 2; j < Math.sqrt(i); j++) {
            if(j % i == 0)
                return false;
        }
        return true;
    }
}
