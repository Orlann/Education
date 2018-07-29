package com.boostbrain.filesLesson10;

import java.io.*;

public class Files {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File dir = new File("./src");
//      теж правильно працює
//        File dir = new File(".\\src");

        String[] names = dir.list();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        File file = new File("pom.xml");
        System.out.println(file.length());

        FileInputStream input = new FileInputStream(file);
        int length = input.available();     //скільки байтів доступні для читання
        System.out.println(length);

        byte[] data = new byte[length];   //масив для зчитування байтів
        input.read(data);             //з файлу Input зчиталися байти в масив data

//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }

        String text = new String(data); //створення String з масиву байтів
        System.out.println(text);

        File newFile2 = new File("./data/proba.xml");
        FileOutputStream output2 = new FileOutputStream(newFile2,true);
        output2.write(data);
        String addedString = "<!-- This string added by program-->\n";
        byte[] addedStringArray = addedString.getBytes();   //масив байтів з тексту addedString
        output2.write(addedStringArray);
        output2.close();
    }
}
