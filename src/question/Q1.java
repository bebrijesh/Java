package question;

import java.util.Scanner;

// 1. Write a program to print whether a number is even or odd, also take input from the user.

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        /*
            - Don't use / .
            - Use % because you need to compare reminder with 0.
         */
        if (number % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
