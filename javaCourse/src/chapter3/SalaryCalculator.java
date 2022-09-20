package chapter3;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        //Initialize the known values

        int salary = 1000;
        int bonus = 250;

        //Get values for the unknown

        System.out.println("How many sales did the employee make tis week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for the bonus earners

        if (sales > 10) {
            salary = salary + bonus;
        }


        //Output
        System.out.println("The employees' pay is $" + salary);


    }


}
