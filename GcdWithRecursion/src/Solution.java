public class Solution {
    public int greatestCommonDivisor(int a ,int b){
        if(b == 0){
            return a;
        }
        return greatestCommonDivisor(b,a % b);
    }
}

