public class LogicalOperators {
    public static void main(String[] args) {
        /*
            # What is Logical Operators?
            - There are 2 type of logical operators:
            - 1. OR Operator "||"
            - 2. AND Operator "&&"

            # How OR Operator works?
            - true || true = true
            - true || false = true
            - false || true = true
            - false || false = false

            # How AND Operator works?
            - true && true = true
            - true && false = false
            - false && true = false
            - false && false = false
         */

        // 1. OR Operator "||"
        int num1 = 1;
        int num2 = 2;
        boolean answer = num1 == 1 || num2 == 2;
        System.out.println(answer);

        // 2. AND Operator "&&"
        boolean anser2 = num1 == 1 && num2 == 2;
        System.out.println(anser2);
    }
}
