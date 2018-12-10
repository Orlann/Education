package ua.edu.lnu.financial.stringTasks;

public class CenterText {

    public static void main(String[] args) {
        findCentralCharacters("Soloma");
    }

    public static void findCentralCharacters(String text) {
        int textLength = text.length();
        int centerOfText = textLength / 2 - 1;
        char[] textChar = text.toCharArray();
        System.out.print(textChar[centerOfText]);
        System.out.println(textChar[centerOfText = 1]);

    }
}
