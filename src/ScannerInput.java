import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(number);
        input.nextLine();

        System.out.println("Enter your text:");
        String name = input.nextLine();
        System.out.println(name);

    }
}
