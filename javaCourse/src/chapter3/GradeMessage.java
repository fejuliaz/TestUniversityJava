package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade) {

            case "A":
                message = "Excellect job";
                break;
            case "B":
                message = "Good work";
                break;
            case "C":
                message = "Try next time";
                break;
            default:
                message = "Error invalid grade";
                break;

        }
        System.out.println(message);


    }
}
