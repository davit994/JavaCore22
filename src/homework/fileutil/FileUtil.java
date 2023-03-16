package homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createFileWithContent();
    }


    static void fileSearch() {
        System.out.println("Enter the path to search:");
        String path = scanner.nextLine();

        System.out.println("Enter the file name to search:");
        String fileName = scanner.nextLine();

        File file = new File(path, fileName);
        System.out.println(file.exists());
    }


    static void contentSearch() {
        System.out.println("Enter the path to search: ");
        String path = scanner.nextLine();

        System.out.println("Enter keyword to search: ");
        String keyword = scanner.nextLine();

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    try {
                        Scanner fileScanner = new Scanner(file);
                        while (fileScanner.hasNextLine()) {
                            String line = fileScanner.nextLine();
                            if (line.contains(keyword)) {
                                System.out.println(file.getName());
                                break;
                            }
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }


    static void findLines() {
        System.out.print("Enter the path to the text file: ");
        String txtPath = scanner.nextLine();
        System.out.print("Enter the keyword to search for: ");
        String keyword = scanner.nextLine();
        scanner.close();
        try {
            findLines(txtPath, keyword);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void findLines(String txtPath, String keyword) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(txtPath));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains(keyword)) {
                System.out.println(line);
            }
        }
        reader.close();
    }


    static void printSizeOfPackage() {
        System.out.println("Enter path: ");
        String path = scanner.nextLine();

        File folder = new File(path);
        long size = calculateFolderSize(folder);

        System.out.println("The size of the package is " + size + " bytes");
    }

    static long calculateFolderSize(File folder) {
        long size = 0;
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    size += calculateFolderSize(file);
                } else {
                    size += file.length();
                }
            }
        }
        return size;
    }


    static void createFileWithContent() {
        System.out.println("Enter the path where you want to create the new file:");
        String path = scanner.nextLine();
        System.out.println("Enter the name for the new file:");
        String fileName = scanner.nextLine();
        System.out.println("Enter the content for the new file:");
        String content = scanner.nextLine();

        File file = new File(path, fileName);

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating file.");
            e.printStackTrace();
        }
    }
}