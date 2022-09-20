package chapter8;
/*
Validate the password
- at least 8 characters
- contain an uppercase
- contain a special character
- not contain the username
- not the same as the old password
 */

import java.util.Locale;
import java.util.Scanner;

public class Password {

    private String username;
    private String currentPassword;

    private boolean valid;
    private String errorMessage;

    private static Scanner scanner = new Scanner(System.in);

    public  void closeScanner(){
        scanner.close();
    }

    public boolean isValid(){
        return valid;
    }

    public String getErrorMessage(){
        return errorMessage;
    }


    public Password(String username, String currentPassword) {
        this.username =username;
        this.currentPassword =currentPassword;
    }

    public static Password login(){
        System.out.println("Please enter your login : ");
        String username = scanner.nextLine();

        System.out.println("Please enter your password");
        String password = scanner.nextLine();

        return new Password(username, password);
    }

    public void printPasswordRules(){
        System.out.println("Your new password must meet the following rules");
        System.out.println("* at least 8 characters long");
        System.out.println("* contains an uppercase");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public String setNewPassword(){
        System.out.println("Enter your new password: ");
        return scanner.nextLine();
    }

    public void changePassword(String newPassword){

        valid = true;
        errorMessage = "";

        if (newPassword.length()< 8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters";
        }

        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage +="\n Your password must contain an Uppercase";
        }

        if (newPassword.matches("[a-zA-z0-9 ]*")) {
            valid = false;
            errorMessage += "\n Your password must contain a special character";
        }
        if (newPassword.equals(currentPassword)){
            valid = false;
            errorMessage+= "\n Your new password must be different from your current password";
        }
    }

    public static void main(String[] args) {
        var validator = login();
        validator.printPasswordRules();

        do{
            var proposedPassword = validator.setNewPassword();
            validator.changePassword(proposedPassword);

            if (!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }
        }while (!validator.isValid());

        System.out.println("The created password is valid");
        validator.closeScanner();

    }
}
