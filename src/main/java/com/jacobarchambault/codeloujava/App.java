package com.jacobarchambault.codeloujava;

import com.opencsv.CSVReaderHeaderAware;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, InputMismatchException {

//        This code creates two different CSVreaders to read our files, and lists of strings from those files
        CSVReaderHeaderAware reader = new CSVReaderHeaderAware(new FileReader("FEDFUNDS.csv"));
        CSVReaderHeaderAware reader2 = new CSVReaderHeaderAware(new FileReader("INTDSRUSM193N.csv"));
        List<String[]> fedFunds = reader.readAll();
        List<String[]> discountRate = reader2.readAll();

//        This creates a file writer and an output stream that will write to the file "result.csv"
        FileOutputStream fos = new FileOutputStream("result.csv", false);
        PrintWriter pw = new PrintWriter(fos);

        int choice = Menu.selection();

        switch (choice) {
            case 1:
                for (String[] nextLine : reader) {
                    // nextLine[] is an array of values from the line
                    if (Float.parseFloat(nextLine[1]) > 4.5) {
                        pw.println(nextLine[0] + "," + nextLine[1]);
                    }
                }
                break;
            case 2:
                for (String[] value : reader2) {
                    if (Float.parseFloat(value[1]) < 4.6) {
                        pw.println(value[0] + "," + value[1]);
                    }
                }
                break;
            case 3:
                pw.println("Date,Federal Funds Rate,Discount Rate");
                for (String[] ffl : fedFunds) {
                    for (String[] drl : discountRate) {
                        // comparison code
                        if (ffl[0].equals(drl[0]) && Float.parseFloat(ffl[1]) > Float.parseFloat(drl[1]))
                            pw.println(ffl[0] + "," + ffl[1] + "," + drl[1]);
                    }
                }
                break;
            case 4:
                pw.println("Date,Federal Funds Rate,Discount Rate");
                for (String[] ffl : fedFunds) {
                    for (String[] drl : discountRate) {
                        // comparison code
                        if (ffl[0].equals(drl[0]) && Float.parseFloat(ffl[1]) < Float.parseFloat(drl[1]))
                            pw.println(ffl[0] + "," + ffl[1] + "," + drl [1]);
                    }
                }
                break;
            default:
                System.out.println("Exiting");
                System.exit(0);
        }

        System.out.println("Your file is ready! It is titled result.csv");

        pw.close();
    }

}