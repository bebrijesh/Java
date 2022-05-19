public class ConditionStatement {
    public static void main(String[] args) {
        /*
            # What is Condition Statement?
            - There 4 type of condition statement:
                1. If Statement
                2. Else Statement
                3. Else-If Statement
                4. Switch Statement
         */

        // # If, Else, Else-If
        int num1 = 11;
        int num2 = 2;
        if (num1 > 0) {
            System.out.println("Num1 is greater than 0.");
        } else if (num1 < 0) {
            System.out.println("Num1 is lesser than 0.");
        } else {
            System.out.println("Num1 is 0.");
        }

        // # Switch Statement
        switch (num1) {
            case 1:
                System.out.println("This is case 11");
                break;
            case 2:
                System.out.println("This is case 12");
                break;
            default:
                System.out.println("No case selected.");
                break;
        }
    }
}
