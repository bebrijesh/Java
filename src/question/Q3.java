package question;

import java.util.Scanner;

// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Q3 {
    public static void main(String[] args) {
        /*
        Simple Interest Formula:
        P = Principal Amount
        I = Interest Amount
        r = Rate of Interest per year in decimal; r = R/100
        R = Rate of Interest per year as a percent; R = r * 100
        t = Time Periods involved

        I = P * R * t
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your principal amount: ");
        int principalAmount = input.nextInt();

        System.out.println("Enter your rate of interest per year as a percentage: ");
        double rateOfInterest = input.nextDouble();

        System.out.println("Enter your time period in year: ");
        int timePeriodInYear = input.nextInt();

        double simpleInterest = principalAmount * rateOfInterest * timePeriodInYear / 100;
        System.out.println("Your simple interest is: " + simpleInterest);
    }
}
