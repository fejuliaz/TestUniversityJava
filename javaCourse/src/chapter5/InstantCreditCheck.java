package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //get what we don't
        double salary = getSalary();
        int score = getScore();
        scanner.close();

        //check if qualified
        boolean qualified = isUserQualified(score, salary);

        //notify
        notifyUser(qualified);

    }

    public static double getSalary() {
        System.out.println("Enter your salary ");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getScore() {
        System.out.println("Enter your credit score : ");
        int score = scanner.nextInt();
        return score;
    }

    public static boolean isUserQualified(int score, double salary) {
        if (score >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        } else {
            return false;
        }


    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified){
            System.out.println("Congrats! You are qualified");
        }
        else  {
            System.out.println("Sorry! You are not qualified!");
        }
    }

}
