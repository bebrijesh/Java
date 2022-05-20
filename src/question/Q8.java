package question;
// 8. To find out whether the given String is Palindrome or not.

import java.util.Locale;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter your String: ");
        Scanner sc = new Scanner(System.in);

        // Creating to variable. One for use input String and the second one is for reverse String.
        String str = sc.next().toLowerCase(Locale.ROOT);
        String revStr = "".toLowerCase(Locale.ROOT);

        // Using ".length()" method we are finding the length of String.
        int strLength = str.length();

        /*
            # Logic part explained:
            - We used "for loop" for taking the length of String.
            - Minus it in by 1, until it become zero.
            - Why we are minus by 1 because of array index start with zero.
            - So we get same number than compare to array index.
            - Then storing each character in [String revStr] by using [.charAt(i)].
            - Character is storing is in reverse ordered.
         */
        for (int i = strLength - 1; i >= 0; i--){
            revStr = revStr + str.charAt(i);
        }

        /*
            - Here we are comparing two String to each other.
            - We are using [.equal()] method.
         */
        if (str.equals(revStr)) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }
}
