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
        merge(arr,rightArray,leftArray);
    }
    public void merge(int[] arr,int[]leftArray,int[] rightArray){
        int length = arr.length;

        int leftLength = leftArray.length;
        int righLength = rightArray.length;
        int i = 0,j = 0,k=0;
        while(i <leftLength && j< righLength ){
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }
        while(i< leftLength){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j< righLength){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }
}
