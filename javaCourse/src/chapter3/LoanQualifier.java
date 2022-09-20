package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {

        //values we know
        int requieredSalary = 30000;
        int requieredYears = 2;

        //values we don't

        System.out.println("Incert your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();


        System.out.println("Incert years on the job");
        double years = scanner.nextDouble();

        scanner.close();

        //decision to take - output
        if (salary >= requieredSalary) {
            if (years >= requieredYears) {
                System.out.println("Met requirenments");
            } else {
                System.out.println("You don't have a loan");
            }
        } else {
            System.out.println("You don't have a loan");
        }

    }

}
