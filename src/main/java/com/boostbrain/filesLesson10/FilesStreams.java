package com.boostbrain.filesLesson10;

import java.io.*;

public class FilesStreams {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream inputFile = null;
        FileOutputStream outputFile = null;
                try {
            //        File file = new File("pom.xml");
            inputFile = new FileInputStream("pom.xml");
            byte[] inputFileBytes = new byte[inputFile.available()];
            inputFile.read(inputFileBytes);     //з файла inputFile зчитуєм масив байтів в inputFileBytes
            String inputFileString = new String(inputFileBytes);
            System.out.println(inputFileString);

            File file2 = new File("./data/pom2.xml");
            outputFile = new FileOutputStream(file2, true); //true - буде дописуватися до файлу, а не стиратися
            outputFile.write(inputFileBytes);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            try{
                if(inputFile!=null)
                    inputFile.close();
                if(outputFile!=null){
                    outputFile.close();
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }

        // Part 2 Try with resources and PrintStream

        String text = "Added information to file";
        try (FileOutputStream fos = new FileOutputStream("./data/file.txt",true); PrintStream ps = new PrintStream(fos)) {
            ps.println(text);
            System.out.println("Program added text\n");
        } catch (IOException ex1) {
            ex1.getMessage();
        }
    }
}
