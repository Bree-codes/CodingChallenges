public class Solution {

    public int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;  // The GCD is stored in a when b becomes 0
    }
}

