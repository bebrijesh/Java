import java.util.Scanner;

// 6. Input currency in rupees and output in USD.
public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter your amount INR: ");
        Scanner input = new Scanner(System.in);

        double rupees = input.nextDouble();
        double usd = rupees * 77.41;

        System.out.println("Your amount in USD: " + usd);
    }
}
