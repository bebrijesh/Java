package question;
// 7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        /*
        0 + 1 = 1
        1 + 1 = 2
        1 + 2 = 3
         */

        int firstNumber = 0;
        int secondNumber = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your fibonacci series range: ");
        int range = input.nextInt();
            System.out.println(firstNumber);
            System.out.println(secondNumber);

        for (int i = 0; i < range; i++) {
            int answer = firstNumber + secondNumber;
            System.out.println(answer);
            firstNumber = secondNumber;
            secondNumber = answer;
        }
    }
}
