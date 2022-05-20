////package question;
//// 8. To find out whether the given String is Palindrome or not.
//
//import java.util.Scanner;
//
//public class Q {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        // Using method here and passing a, b into the method.
//        findArmstrong(a, b);
//    }
//
//    static void findArmstrong(int a, int b) {
//        /*
//            - Creating "for loop" for range.
//            - int i = a will be start point(starting digit).
//            - i <=b will be end point(Ending digit).
//         */
//        for (int i = a; i <= b; i++) {
//            /*
//                - This is calculation logic for finding aramsto
//                - [int num = i;]
//             */
//            int num = i;
//            int sum = 0;
//
//            while (num > 0) {
//                int remainder = num % 10;
//                sum = sum + (remainder * remainder * remainder);
//                num = num / 10;
//            }
//            if (sum == i) {
//                System.out.println(sum);
//            }
//        }
//    }
//}
