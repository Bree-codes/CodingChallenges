public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial of 8 is: " + factorial(8));
    }

    public static int factorial(int num){
        if(num < 1) {
            System.out.println("Reached base case with num = " + num + ", returning 1");
            System.out.println();
            return 1;
        }
        System.out.println("Calling factorial(" + num + ") with num = " + num);
        int result = num * factorial(num - 1);
        System.out.println("Returning " + result + " for factorial(" + num + ")");
        return result;
    }
}

