package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void createNewFile() {
        File file = new File("resoursece/nonexists.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exists");
            e.printStackTrace();
        }

    }

    public static void numbersExceptionsHandling() {
        File file = new File("resoursece/nonexists.txt");

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        createNewFile();
        numbersExceptionsHandling();

    }
}
