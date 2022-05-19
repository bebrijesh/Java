public class Loops {
    public static void main(String[] args) {
        /*
            # What is Loops?
            - There are 4 type of loop:
            1. For loop
            2. While loop
            3. Do while loop
            4. For each loop
         */

        /*  # 1. For loop
            ##  Syntax of For loop
            for (Variable; Condition; Increment) {
                // Code...
            }
         */
        int num = 1;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello World!");

        /*
            # 2. While loop
            ## Syntax of while loop
            while (Condition) {
                Increment
                // Code...
            }
         */
        while (num < 10) {
            num++;
            System.out.println("Hello World!");
        }

        /*
            # 3. Do while loop
            ## Syntax of do while loop
            do {
                Increment
                // Code...
            } While (Condition);
         */
        do {
            System.out.println("Hello World");
        } while (num < 10);
    }
}
