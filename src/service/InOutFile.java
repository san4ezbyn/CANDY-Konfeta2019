package service;

import entities.Sweets;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class InOutFile {

    private static File konfetaFile = new File("konfetaFile.txt");

    public static void writeIn(List<Sweets> sweets) throws IOException {

       try( BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(konfetaFile))) {
           bufferedOutputStream.write("PODAROK:"+ Content.podarokContent(sweets));
           System.out.println("Content is written IN the file");
        };

    }

    public static void readOut(List<Sweets> sweets) throws FileNotFoundException {

        Scanner scan = new Scanner(new BufferedInputStream(new FileInputStream(konfetaFile)));

        System.out.println("Text from file:\n");

        while (scan.hasNextLine()) {
            String readFromFile = scan.nextLine();
            System.out.println(readFromFile);

        }
    }
}
