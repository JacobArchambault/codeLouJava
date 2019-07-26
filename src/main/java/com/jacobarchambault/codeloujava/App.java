package com.jacobarchambault.codeloujava;

import com.opencsv.CSVReaderHeaderAware;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, ParseException {

//        This code creates two different CSVreaders to read our files
        CSVReaderHeaderAware reader = new CSVReaderHeaderAware(new FileReader("FEDFUNDS.csv"));
        CSVReaderHeaderAware reader2 = new CSVReaderHeaderAware(new FileReader("INTDSRUSM193N.csv"));

//        This creates a file writer and an output stream that will write to the file "result.csv"
        FileOutputStream fos = new FileOutputStream("result.csv", false);
        PrintWriter pw = new PrintWriter(fos);

//        This code prints out the main menu to the console.
        System.out.println("Enter a number to choose an option:");
        System.out.println("1. Print a list of months where the federal funds rate was above the recorded average");
        System.out.println("2. Print a list of months where the federal reserve discount rate was below the recorded average");
        System.out.println("3. Print a list of months where the federal funds rate was greater than the federal reserve discount rate");
        System.out.println("4. Exit program");

//        Along with the code for the cases listed below, this code allows the user to choose an option from the menu.
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                for (String[] nextLine : reader) {
                    // nextLine[] is an array of values from the line
                    if (Float.valueOf(nextLine[1]).floatValue() > 4.5) {
                        pw.println(nextLine[0] + "," + nextLine[1]);
                    }
                }
                System.out.println("Your file is ready! It is titled result.csv");
                break;
            case 2:
                for (String[] value : reader2) {
                    if (Float.valueOf(value[1]).floatValue() < 4.6) {
                        pw.println(value[0] + "," + value[1]);
                    }
                }
                System.out.println("Your file is ready! It is titled result.csv");
                break;
            case 3:
                List<String[]> fedFunds = reader.readAll();
                List<String[]> discountRate = reader2.readAll();
                for (String[] ffl : fedFunds) {
                    for (String[] drl : discountRate) {
                        // comparison code
                        if (ffl[0].equals(drl[0]) && Float.valueOf(ffl[1]).floatValue() > Float.valueOf(drl[1]).floatValue())
                            pw.println("Date: " + ffl[0] + "," + " Federal funds rate: " + ffl[1] + " Discount Rate: " + drl [1]);
                    }
                }
                break;
            default:
                System.out.println("Exiting");
                System.exit(0);
        }

        pw.close();

//    TODO 2: Find or create any two data sets of your choosing that your application will read from. Acceptable formats include JSON, CSV, txt, SQL database.
//    TODO 2.1: Import all or a subset of this data

//    TODO 3: Application must write data TO A FILE distinct from those from which the information is imported

//    TODO 4: The application must allow the user to interact with the data, e.g. via a command-line console application, e.g. 'press 1 to view ... press 2 to view ...'

//    TODO 5: Your code must include comments

//    TODO 6: Project must be in its own repository on Github

    }
}
