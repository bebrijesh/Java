public class ComparisonOperator {
    public static void main(String[] args) {
        /*
            # Type of Comparison Operator:
            1. Less than "<"
            2. Greater than ">"
            3. Equal too "=="
            4. Not equal too "!="
            5. Less than equal too "<="
            6. Greater than equal too ">="
         */

        int num1 = 1;
        int num2 = 2;

        // 1. Less than "<"
        boolean lessThan = num1 < num2;
        System.out.println(lessThan);

        // 2. Greater than ">"
        boolean greaterThan = num1 > num2;
        System.out.println(greaterThan);

        // 3. Equal too "=="
        boolean equalToo = num1 == num2;
        System.out.println(equalToo);

        // 4. Not equal too "!="
        boolean notEqualToo = num1 != num2;
        System.out.println(notEqualToo);

        // 5. Less than equal too "<="
        boolean lessThanEqualToo = num1 <= num2;
        System.out.println(lessThanEqualToo);

        // 6. Greater than equal too ">="
        boolean greaterThanEqualToo = num1 >= num2;
        System.out.println(greaterThanEqualToo);
    }
}
