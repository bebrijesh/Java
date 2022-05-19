public class ArithmeticOperator {
    public static void main(String[] args) {
        /*
            # What is Arithmetic  Operator?
            - There are 5 type of arithmetic operators:
                1. Addition "+"
                2. Subtraction "-"
                3. Multiplication "*"
                4. Division "/"
                5. Modulo "%"
         */

        // 1. Addition "+"
        int num1 = 1;
        int num2 = 2;
        System.out.println(num1 + num2);

        // 2. Subtraction "-"
        int num3 = 2;
        int num4 = 1;
        System.out.println(num3 - num4);

        // 3. Multiplication "*"
        int num5 = 2;
        int num6 = 2;
        System.out.println(num5 * num6);

        // 4. Division "/"
        double num7 = 6;
        double num8 = 2;
        System.out.println(num7 / num8);
        /*
            NOTE:
            - Never set value of second number to "0", It will give the error.
            - If you want your result in decimal point you need to use double. Because int will automatically truncate digits after point.
         */

        // 5. Modulo "%"
        double num9 = 6;
        double num10 = 2;
        System.out.println(num9 % num10);

    }
}
