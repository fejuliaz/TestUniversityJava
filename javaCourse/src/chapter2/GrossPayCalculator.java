package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]) {

        //Get the number of hours worked

        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //get the hourly pay rate

        System.out.println("Insert the employees pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //Multiply hours by rate
        double grossPay = hours * rate;

        //display results
        System.out.println("The employees grosspay is $" + grossPay);

    }
}
