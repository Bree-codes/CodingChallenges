public class Solution {
   public void selectionSort(int[] arr){
       for(int i = 0; i <arr.length -1; i++){
           for(int j = i + 1; j < arr.length; j++){
               if(arr[j] < arr[i]){
                   swap(arr,i,j);
               }
           }
       }
   }
    public void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
