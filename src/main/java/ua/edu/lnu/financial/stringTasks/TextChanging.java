package ua.edu.lnu.financial.stringTasks;

public class TextChanging {
    final static String TEXT = "I study Object Oriented Programming. I like object oriented programming.";
    final static String TEXT_FOR_CHANGE = "Object Oriented Programming";
    final static String NEW_TEXT = "OOP";


    public static void main(String[] args) {
        String newText2 = changeText(TEXT,TEXT_FOR_CHANGE,NEW_TEXT);
        newText2 = changeText(newText2,"object oriented programming",NEW_TEXT);
        System.out.println(newText2);
    }



    public static String changeText(String text, String findText, String newText){
        return text.replaceAll(findText,newText);
    }
}
