package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    static Scanner scanner = new Scanner(System.in);

    static String [] weekDays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    public static boolean validateWeekNumber (int weekNumber){
        if (weekNumber <= 0 || weekNumber > 7){
            System.out.println("Wrong number, please provide from 1 to 7");
            return false;
        }
        return true;
    }

    public static int getWeekDayNumber(){
        System.out.println("Insert the number of the weekday : ");
        int weekNumber = scanner.nextInt();
        return weekNumber;
    }


    public static void main(String[] args) {
        int weekdayNumber = getWeekDayNumber();
        boolean isCorrectNumber = true;

        while (isCorrectNumber) {
            if (validateWeekNumber(weekdayNumber)) {
                System.out.println("It's" + weekDays[weekdayNumber - 1]);
                isCorrectNumber=false;
            }
            else {
                weekdayNumber = getWeekDayNumber();
            }
        }


    }
}
