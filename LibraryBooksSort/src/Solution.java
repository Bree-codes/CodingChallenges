public class Solution {
    //Here we have the 2 main methods merge sorting the random numbers
    //then binary searching for the specific num we need

    //merge sort
    public void mergeSort(int[] arr){

        int length = arr.length;

        if (length <= 1) return;

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];


        for(int i = 0 ; i < length ; i++){
            if(i < mid){
                leftArray[i] = arr[i];
            }
            else{
                rightArray[i - mid] = arr[i];
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(arr,rightArray,leftArray);
    }
    public void merge(int[] arr,int[]leftArray,int[] rightArray){

        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0,j = 0,k=0;
        while(i <leftLength && j< rightLength ){
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i< leftLength){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j< rightLength){
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
            System.out.println(value);

            if(target > value){
                low = middle + 1;
            }
            else if(target < value){
                high = middle - 1;
            }
            else return;
        }
    }

}
