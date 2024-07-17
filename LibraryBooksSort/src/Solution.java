public class Solution {
    //Here we have the 2 main methods merge sorting the random numbers
    //then binary searching for the specific num we need

    //Merge sort
    public void mergeSort(int[] arr) {
        int length = arr.length;

        if (length <= 1) return;

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        // Copying elements to the left array
        System.arraycopy(arr, 0, leftArray, 0, mid);

        // Copying elements to the right array
        if (length - mid >= 0) System.arraycopy(arr, mid, rightArray, 0, length - mid);

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(arr, leftArray, rightArray);
    }

    public void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, j = 0, k = 0;

        // Merging the arrays
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copying remaining elements of leftArray
        while (i < leftLength) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copying remaining elements of rightArray
        while (j < rightLength) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    //binary search
    public void binarySearch(int[] arr, int target){

        int low = 0, high = arr.length - 1;

        while(low <= high){

            int middle = low + (high - low) / 2;
            int value = arr[middle];

            if(target > value){
                low = middle + 1;
            }
            else if(target < value){
                high = middle - 1;
            }
            else {
                System.out.println("Target " + target + " found at index " + middle);
                return;
            }
        }
        System.out.println("Target not found in the array!");
    }

}
