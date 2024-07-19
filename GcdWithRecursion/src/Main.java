public class Main {
    public static void main(String[] args) {
        int a = 48,b = 18;

        Solution solution = new Solution();
        int gcd = solution.greatestCommonDivisor(a,b);
        System.out.println("The gcd of "+ a +" and "+ b + " is: "+ gcd);
    }
}
