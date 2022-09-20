package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    
    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            //ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;

            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket,randomNumber));
        }

        return ticket;

    }

    /**
     * Does a sequential search on the array to find the values
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found , false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){
        /*enchanced loops,
        it goes through the entire array and assign the value
         */
        for(int value:array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        /*
        If we're reached to this point, the entire array was searched
        and the value was not found
         */
        return  false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        //Array must be sorted for binary search

        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >=0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }
}
