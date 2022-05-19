import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        // Random work same as a Scanner input = new Scanner(System.in);
        Random input = new Random();
        /*
            NOTE:
            - When you pass value in .nextInt it will bound to that number and not go further.
         */
        int number = input.nextInt(2);
        System.out.println(number);
    }
}
