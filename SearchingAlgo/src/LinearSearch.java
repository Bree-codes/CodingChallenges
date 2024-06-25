public class LinearSearch {

    public int solution(int[] arr, int num){
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == num){
                return i;
                
            }
        }
        System.out.println("NA");
        return -1;
    }

}
