public class InsertNum {

    public static int[] insertIntoSortedArray(int[] arr, int num) {
        int[] newArr = new int[arr.length + 1];
        int insertIndex = 0;

        // Find the insertion index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num) {
                insertIndex = i;
                break;
            }
            newArr[i] = arr[i];
        }

        // Insert the new number
        newArr[insertIndex] = num;
        for (int i = insertIndex; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }
}

