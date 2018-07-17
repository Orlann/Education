package com.boostbrain.collectionsLesson12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Maps {
    public static void main(String[] args) throws IOException {
        FileInputStream inputFile = new FileInputStream("./data/AsiaCountry.txt");
        byte[] inputByteArray = new byte[inputFile.available()];
        inputFile.read(inputByteArray);

        String inputFileString = new String(inputByteArray);
        ArrayList<String> inputFileList = new ArrayList<String>();
        String[] data = inputFileString.split("\n");
        for (String name : data) {
            inputFileList.add(name);
        }

        System.out.println(inputFileList);
    }
}
