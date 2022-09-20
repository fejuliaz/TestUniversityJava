package chapter3;

import java.util.Scanner;

public class QoutaCalculator {

    public static void main(String[] args) {
        //initialize values we know
        int quota = 10;

        //get value we don't know
        System.out.println("Enter the number of sales you made this week");
        Scanner scanner =  new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //make a decision on a path - outut

        if (sales >= quota){
            System.out.println("Congrats!");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not meet your quota" + salesShort);
        }
    }
}
