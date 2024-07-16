import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int noOfRandomNums = 10;

        for(int i = 0 ; i < noOfRandomNums; i++){
            int randomNums = random.nextInt(100);
            System.out.print(randomNums + ",");
        }



    }
}