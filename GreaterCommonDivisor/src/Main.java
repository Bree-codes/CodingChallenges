public class Main {
    public static void main(String[] args) {
        int a = 18, b = 48;

        Solution solution = new Solution();
        int gcd = solution.greatestCommonDivisor(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);

    }
}
