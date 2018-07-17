package com.boostbrain.collectionsLesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) throws IOException {
        FileInputStream iputFile = new FileInputStream("./data/EuropeCapitals.csv");
        int fileLength = iputFile.available();
        byte[] data = new byte[fileLength];
        iputFile.read(data);

        String stringFromData = new String(data);
//        System.out.println(stringFromData);

        ArrayList<String> arrayList = new ArrayList<String>();

        String[] textLines = stringFromData.split(",");
        for (String name : textLines) {
            arrayList.add(name);
        }

//        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).startsWith("S")) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
