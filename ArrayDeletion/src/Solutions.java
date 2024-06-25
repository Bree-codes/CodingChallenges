public class Solutions {

    public int searchElement(int[] arr,int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        System.out.println("Element Not Found!");
        return -1;
    }

    //deleting an element given the index
    public int[] deleteElement(int[] arr, int index){
        if(index < 0 || index >= arr.length){
            //throw new IllegalArgumentException("The index you entered is beyond the range of the given array!");
            System.out.println("The index you entered is beyond the range of the given array!");
        }
        int[] newArray = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                //j increments only when the element in ith position is copied to index j of the new array
                newArray[j++] = arr[i];
            }
        }
        return newArray;
    }

}
