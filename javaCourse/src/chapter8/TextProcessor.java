package chapter8;

public class TextProcessor {
    //Method to count words splitted by " "
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for(int i=0;i<numberOfWords;i++){
            System.out.println(words[i]);
        }
    }

    //Method to reverse string from the last character to the first
    public static void reverseString(String text){
        for (int i=text.length()-1; i >=0;i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text){

        var modifiedText = new StringBuilder(text);
        for (int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }

    public static void main(String[] args) {
        countWords("I love Test Automation University");

        reverseString("Hello TAU!");
        System.out.println();

        addSpaces("HeyWorld!It'sMeAngie");
    }
}
