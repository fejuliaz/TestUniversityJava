package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        //Asks user for a season of the year
        System.out.println("Type a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        //asks for adjective
        System.out.println("Please type an adjective");
        String adj = scanner.nextLine();

        //ask for a whole number
        System.out.println("Please provide a whole number");
        int number = scanner.nextInt();
        scanner.close();


        //output sentence
        System.out.print("On a " + adj +" " + season + "day, I drink a minimum of " + number + " cups of coffee.");

    }
}
