import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String to be reversed: ");
        String str = scanner.nextLine();

        System.out.print("The Reversed String is: " +reverseString(str) );

    }
    public static String reverseString(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverseString(str.substring(1))+ str.charAt(0);
    }
}
