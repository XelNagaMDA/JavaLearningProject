package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static boolean createTheFileIfItDoesNotExist(File file) throws IOException {
        return file.createNewFile();
    }

    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file is present.");
        } else {
            System.out.println("The file is not present.");
        }
    }

    public static void printTheFileName(File file) {
        System.out.println(file.getName());
    }

    public static void printTheAbsolutePath(File file) {
        System.out.println(file.getAbsolutePath());
    }

    public static void printIfItIsADirectoryOrAFile(File file) {
        if (file.isFile()) {
            System.out.println("This is a file.");
        } else {
            System.out.println("This is a directory.");
        }
    }
}
