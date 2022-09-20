package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        //values
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        //values needed
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("How many pennies?");
        int numberOfPennies = scanner.nextInt();

        System.out.println("How many nickels?");
        int numberOfNickels = scanner.nextInt();

        System.out.println("How many dimes?");
        int numberOfDimes = scanner.nextInt();

        System.out.println("How many quarters?");
        int numberOfQuarters = scanner.nextInt();

        scanner.close();

        //calculations
        double total = numberOfPennies * penny + numberOfNickels * nickel + numberOfDimes * dime + numberOfQuarters * quarter;

        //decisions - output

        if (total < dollar) {

            double amountShort = dollar - total;
            System.out.println("Sorry, you lost! You were short " + String.format("%.2f", amountShort) + " cents.");

        } else if (total > dollar) {

            double amountOver = total - dollar;
            System.out.println("Sorry, you lost! You were over " + String.format("%.2f", amountOver) + " cents.");
        } else {
            System.out.println("Congratulations! You Won !");
        }
    }
}
