import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Generating Random Numbers.
        Random random = new Random();
        int noOfRandomNums = 10;

        int[] randomNumsArray = new int[noOfRandomNums];

        for(int i = 0 ; i < noOfRandomNums; i++){
          randomNumsArray[i] = random.nextInt(100);
        }
        System.out.print(Arrays.toString(randomNumsArray));

        //Creating an instance of Solution class
        Solution solution = new Solution();
        solution.mergeSort(randomNumsArray);
        //solution.binarySearch(randomNumsArray,45);

    }
}