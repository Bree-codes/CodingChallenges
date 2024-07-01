public class Solution {

    public int binarySearch(int arr[] ,int target){

        int low = 0, high = arr.length - 1;

        while(low <= high){

            int middle = low + (high - low) / 2;
            int value = arr[middle];
            System.out.println(value);

            if(target > value){
                low = middle + 1;
            }
            else if(target < value){
                high = middle - 1;
            }
            else return middle;
        }
        return -1;
    }
}
