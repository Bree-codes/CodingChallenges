import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        // Searching for the element.
        int[] arr = {10,16,27,38,2,51,79};
        int num = 27;

        Solutions solutions = new Solutions();
        int k = solutions.searchElement(arr,num);

        System.out.println("The number " + num + " is at index: " + k);

        int[] newArray = solutions.deleteElement(arr,10);
        System.out.println(Arrays.toString(newArray));
    }
}
