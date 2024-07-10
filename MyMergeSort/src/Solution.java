public class Solution {
    public void mergeSort(int[] arr){

        int length = arr.length;
        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        int j = 0;

        for(int i = 0 ; i < length ; i++){
            if(i < mid){
                leftArray[i] = arr[i];
            }
            else{
                rightArray[j] = arr[i];
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

    }
}
