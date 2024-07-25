public class Main {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(sum(num));
    }

    public static int sum(int num) {
        if (num < 1) return 0;
        return num +sum(num - 1);
    }

}
