package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;


        System.out.println("How many hours did you works this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input

        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40.");
            hoursWorked = scanner.nextDouble(); //sentinael - needs to be updated inside the loop, otherwise loop repeats

        }

        scanner.close();

        //calculate
        double gross = rate * hoursWorked;
        System.out.println("Gross Pay :  $" + gross);


    }
}
