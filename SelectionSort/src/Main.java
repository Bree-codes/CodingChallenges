public class Main {
    public static void main(String[] args) {

        int[] arr = {5,0,6,12,1,2};

    Solution solution = new Solution();
    solution.selectionSort(arr);

    for(int i : arr){
        System.out.print(i + " ");
    }

    }
}