import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,16,52,37,25,9,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}