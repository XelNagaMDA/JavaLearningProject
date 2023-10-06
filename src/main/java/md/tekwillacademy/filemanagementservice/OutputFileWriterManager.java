package md.tekwillacademy.filemanagementservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {

    public static void writeInformationIntoAFileUsingFileWriter(String filePath, String content) {
        FileWriter fileWriterObject = null;

        try {
            fileWriterObject = new FileWriter(filePath);
            fileWriterObject.write(content);

        } catch (IOException exceptionObject) {
            System.out.println("There is a problem with the writing process.");
            exceptionObject.printStackTrace();
        } finally {
            if (fileWriterObject != null) {
                try {
                    fileWriterObject.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static void writeContentIntoAFileUsingBufferedWriter(File file, String content) {
        BufferedWriter bufferedWriterObject = null;

        try {
            bufferedWriterObject = new BufferedWriter(new FileWriter(file));
            bufferedWriterObject.write(content);

        } catch (IOException exceptionObject) {
            System.out.println(exceptionObject.getMessage());
        } finally {
            if (bufferedWriterObject != null) {
                try {
                    bufferedWriterObject.close();
                } catch (IOException e) {
                    System.out.println("Unable to close the file.");
                }
            }
        }

    }
}
