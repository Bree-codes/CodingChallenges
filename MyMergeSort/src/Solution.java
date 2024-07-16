public class Solution {
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
}

