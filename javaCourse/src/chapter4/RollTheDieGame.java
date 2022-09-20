package chapter4;

/*
to travel the entire game board of 20 spaces within 5 die rolls.
Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
Repeat this 4 additional times, for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
If they are greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {

        int maxSpace = 20;
        int maxRoll = 5;
        int currentSpace = 0;
        Random random = new Random();

        System.out.println("Welcome to the Roll the Die Game! Let's begin... ");

        for (int i = 1; i <= maxRoll; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if (currentSpace == maxSpace) {

                System.out.println("Congratulations! You Won ! You are on space" + currentSpace);
                break;
            } else if (currentSpace > maxSpace) {

                System.out.println(" Sorry! You are at " + maxSpace + "You lost!");
                break;
            } else if (i == maxRoll && currentSpace < maxSpace) {
                System.out.println("Unfortunately, you didn't make it to all " +
                        maxSpace + " spaces. You lose!");
            } else {
                int moreSpace = maxSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + moreSpace + " more to go.");
            }
            System.out.println();
        }

    }
}
