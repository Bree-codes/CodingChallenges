public class Main {
    public static void main(String[] args){

        int[] arr = {10,16,27,38,2,51,79};
        int num = 27;

        Solutions solutions = new Solutions();
        int k = solutions.searchElement(arr,num);

        System.out.println("The number " + num + " is at index: " + k);
    }
}