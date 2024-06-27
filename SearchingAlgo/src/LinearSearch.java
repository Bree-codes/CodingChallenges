public class LinearSearch {

    public int solution(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;

            }
        }
        System.out.println("NA");
        return -1;
    }

    //method to delete an array given the element itself
    public int[] deleteElement(int[] arr, int num) {
        int count = 0;

        // Count the number of elements not equal to num
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                count++;
            }
        }

        // Create a new array with the appropriate size
        int[] newArray = new int[count];
        int j = 0;

        // Copy the elements not equal to num into the new array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                newArray[j++] = arr[i];
            }
        }
        return newArray;
    }
}

