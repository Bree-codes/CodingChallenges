import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2,5,8,10,11,12,14};
        int num = 10;

        LinearSearch linearSearch = new LinearSearch();
        int n = linearSearch.solution(arr,num);
        System.out.println("The index of element " +num + " is: " +n);

        int[] newArray = linearSearch.deleteElement(arr,12);
        System.out.println(Arrays.toString(newArray));

    }
}