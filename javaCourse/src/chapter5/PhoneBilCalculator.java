package chapter5;

import java.util.Scanner;

public class PhoneBilCalculator {

    static double chargePerMinute = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);
    static double baseCost;
    static double overageMinutes;


    public static void enterBaseCost() {
        System.out.println("Please enter your base cost of the plan");
        baseCost = scanner.nextDouble();
    }

    public static void enterOverageMinutes() {
        System.out.println("Please enter overage minutes");
        overageMinutes = scanner.nextInt();

    }

    public static double calculateTax() {
        return (baseCost+calculateOverage()) * tax;
           }

    public static double calculateOverage() {
       return chargePerMinute * overageMinutes;
    }

    public static double calculateTotal(){
        return baseCost+calculateTax()+calculateOverage();
    }

    public static void main(String[] args) {

        //input the information
        enterBaseCost();
        enterOverageMinutes();
        scanner.close();

        //calculate
        double finalOverage = calculateOverage();
        double calculatedTax = calculateTax();
        double total = calculateTotal();


        //outcome
        System.out.println("Plan:  $" + baseCost  );
        System.out.println("Overage :  $" + finalOverage);
        System.out.println("Tax :  $" + String.format("%.2f",calculatedTax));
        System.out.println("Total:  $" + String.format("%.2f",total));

    }


}
