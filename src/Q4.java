import java.util.Scanner;

// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.(Use if conditions)
public class Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter you second number: ");
        int number2 = input.nextInt();

        /*
        - You can't use nextChar(), There is no method.
        - You need to use next() and charAt(0) method.
        - charAt(Type your index number here) = charAt(0).
        - It will take output using next() and use first character that is index number 0.
         */
        System.out.println("Choose your operator from +, -, *, /");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println("Addition: " + (number1 + number2));
        } else if (operator == '-') {
            System.out.println("Minus: " + (number1 - number2));
        } else if (operator == '*') {
            System.out.println("Multiplication: " + (number1 * number2));
        } else if (operator == '/') {
            System.out.println("Division: " + (number1 / number2));
        }
    }
}
