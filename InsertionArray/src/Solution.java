public class Solution{

    public int[] insertIntoSortedArray(int[] arr, int num, boolean isAscending) {
        int[] newArr = new int[arr.length + 1];
        int insertIndex = arr.length;

        // Find the insertion index based on the order
        for (int i = 0; i < arr.length; i++) {
            if (isAscending) {
                if (arr[i] >= num) {
                    insertIndex = i;
                    break;
                }
            } else {
                if (arr[i] <= num) {
                    insertIndex = i;
                    break;
                }
            }
            newArr[i] = arr[i];
        }

        // Insert the new number
        newArr[insertIndex] = num;

        // Copy the remaining elements
        for (int i = insertIndex; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

}

