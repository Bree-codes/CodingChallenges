public class Solution {

    public int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        //when b becomes 0 then a is automatically the gcd..
        return a;
    }
}

