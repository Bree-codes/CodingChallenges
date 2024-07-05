import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,16,52,37,25,9,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                for(int n : arr){
                    System.out.print(n+"\t");
                }
                System.out.println("Loop"+i+"\n");
            }
        }
    }
}