package com.metanit.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesExample {
    public static void main(String[] args) throws IOException {
//        try {
//            FileInputStream fis = new FileInputStream("./data/AsiaCountriess.txt");
//            throw new ExceptionExample("What file?");       // проба
//        } catch (ExceptionExample ex){
//            System.out.println(ex.getText());
//        }
        FileInputStream inputFile = new FileInputStream("./data/EuropeCapitals.csv");
        byte[] inputFileByteArray = new byte[inputFile.available()];
        inputFile.read(inputFileByteArray);
        String fileText = new String (inputFileByteArray);

        String[] fileStringArray = fileText.split(",");
        for (int i = 0; i < fileStringArray.length; i++) {
            System.out.println(fileStringArray[i]);
        }

        FileOutputStream outputFile = new FileOutputStream("./data/CountriesInEurope.txt",true);
        outputFile.write(inputFileByteArray);
        outputFile.close();
    }
}
