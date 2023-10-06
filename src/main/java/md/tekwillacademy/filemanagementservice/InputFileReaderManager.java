package md.tekwillacademy.filemanagementservice;

import java.io.*;
import java.nio.file.Files;

public class InputFileReaderManager {

    public static void printDataFromAFileUsingFileReader(File file) {
        FileReader fileReaderObject = null;
        try {
            fileReaderObject = new FileReader(file);
            int charNumberInASCIISystem;
            while ((charNumberInASCIISystem = fileReaderObject.read()) != -1) {
                System.out.print((char) charNumberInASCIISystem);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("There is a problem with the read process.");
        } finally {
            try {
                fileReaderObject.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void printDataFromAFileUsingBufferedReader(File file) {
        BufferedReader bufferedReaderObject = null;

        try {
            bufferedReaderObject = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReaderObject.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An Exception occurred. Skip the reading.");
        } finally {
            try {
                bufferedReaderObject.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void printDataUsingTheEasiestWay(File file) {
        try {
            String content = Files.readString(file.toPath());
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
