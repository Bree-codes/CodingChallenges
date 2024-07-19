import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        int a = 120,b = 90;

        Solution solution = new Solution();
        int gcd = solution.greatestCommonDivisor(a,b);
        System.out.println("The gcd of "+ a +" and "+ b + " is: "+ gcd);

        int[] array = {120, 90};

        int GDC = solution.GCD(array, 2, 1);

        System.out.println("GDC : "+GDC);
    }
}
