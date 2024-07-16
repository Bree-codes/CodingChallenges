public class Main {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        //int[] arr = {50,45,37,31,29,26,13};
        int target = 80;

        Solution solution = new Solution();
        int index = solution.binarySearch(arr,target);
        System.out.println("The element is at or would have been at index: " + index);
    }
}
