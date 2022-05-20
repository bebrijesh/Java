package question;

import java.util.Scanner;

// 5. Take 2 numbers as input and print the largest number.
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter your second number: ");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("First number " + number1 + " is largest.");
        } else {
            System.out.println("Second number " + number2 + " is largest.");
        }
    }
}
