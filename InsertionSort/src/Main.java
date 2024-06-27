public class Main {
    public static void main(String[] args) {
        int[] arr ={11,12,13,5,6};
        int i,j;

        //here we are printing the unsorted array
        System.out.println("This is the Unsorted Array:");
        for(i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");

        }

        for(i = 1;i< arr.length;i++){
            int key = arr[i];
            j = i - 1;
                while(j >= 0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    j = j - 1;
                }
                arr[j+1] = key;
        }
        //here we are printing the sorted array
        System.out.println();
        System.out.println("This is the Sorted Array:");
        for(i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}