public class Main {
    public static void main(String[] args) {

        int[] arr = {10,12,8,67,45,90};
        int target = 90;

        int index = linearSearch(arr,target);
        System.out.println("The element was found at index: " + index);
    }

    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
