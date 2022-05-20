package question;

import java.util.Scanner;

// 9. To find Armstrong Number between two given number.
public class Q9 {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);

        String number = sc.next();
        int length = number.length();
        int multi = 0;

        for (int i = length - 1; i >= 0; i--){
            multi = multi ^ number.charAt(i);
        }
        if (number.equals(multi)) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }
}
