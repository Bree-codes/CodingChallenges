import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = 120,b = 90;

        Solution solution = new Solution();
        int gcd = solution.greatestCommonDivisor(a,b);
        System.out.println("The gcd of "+ a +" and "+ b + " is: "+ gcd);
        int len = 1000;
        int[] array = new int[len];
        Random random = new Random();

        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(2,10);
        }
        int GDC = solution.GCD(array, 2, 1);

        System.out.println("GDC : "+GDC);
    }
}
