public class Main {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90,100,110};
        int target = 300;

        Solution solution = new Solution();
        int index = solution.binarySearch(arr,target);
        System.out.println("The element is at index: " + index);
    }
}