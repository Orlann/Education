package com.boostbrain.files;

import java.io.*;

public class FilesStreams {
    public static void main(String[] args ) throws FileNotFoundException, IOException{
//        File file = new File("pom.xml");
        FileInputStream inputFile = new FileInputStream("pom.xml");
        byte[] inputFileBytes = new byte[inputFile.available()];
        inputFile.read(inputFileBytes);     //з файла inputFile зчитуєм масив байтів в inputFileBytes
        String inputFileString = new String(inputFileBytes);
        System.out.println(inputFileString);

        File file2 = new File("pom2.xml");
        FileOutputStream outputFile = new FileOutputStream(file2,true); //true - буде дописуватися до файлу, а не стиратися
        outputFile.write(inputFileBytes);
        outputFile.close();
    }
}
