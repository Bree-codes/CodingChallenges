import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Generating Random Numbers.
        Random random = new Random();
        int noOfRandomNums = 10;

        int[] randomNumsArray = new int[noOfRandomNums];

        for (int i = 0; i < noOfRandomNums; i++) {
            randomNumsArray[i] = random.nextInt(100);
        }
        System.out.println("Generated Random Array: " + Arrays.toString(randomNumsArray));

        // Creating an instance of Solution class
        Solution solution = new Solution();
        solution.mergeSort(randomNumsArray);
        System.out.println("Sorted array: " + Arrays.toString(randomNumsArray));
        System.out.println();

        int numberToFind = randomNumsArray[random.nextInt(1, noOfRandomNums)-1];
        solution.binarySearch(randomNumsArray,numberToFind);
    }
}
