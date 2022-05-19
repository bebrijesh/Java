import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) {
        // Declaring array later
        String[] studentName = new String[3];
        studentName[0] = "Brijesh";
        studentName[1] = "Hemil";
        studentName[2] = "Rahul";

        System.out.println(studentName[2]);

        // Declaring array within
        String[] userName = {"Brijesh", "Hemil", "Rahul"};
        int[] userID = {101, 102, 103};
//        for (int i = 0; i < 3; i++){ // When you know the array size.
        for (int i = 0; i < userID.length; i++) { // When you don't know the array size user ".length"
            System.out.println(userID[i]);
        }

        // Phonebook
        String[] personNames = {"Tom", "Jade", "Fade", "Rax"};
        int[] personContactNumber = {123, 456, 789, 1112};

        // 1st for loop for printing all the person names.
        for (int j = 0; j < personNames.length; j++) {
            System.out.println(personNames[j]);
        }

        // Comparing user input person name to list of person name.
        System.out.print("Please enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String userInputPersonName = scanner.next();
        for (int k = 0; k < personNames.length; k++) {
            if (userInputPersonName.equals(personNames[k])) {
                System.out.println(personContactNumber[k]);
            }
        }
    }
}
