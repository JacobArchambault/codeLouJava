package com.jacobarchambault.codeloujava;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderHeaderAware;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

//    TODO 1: include README:
//    TODO 1.1: Explain what problem you are solving or question you are answering
//    TODO 1.2: Explain how you achieved your solution, including:
//    TODO 1.2.1: background information necessary to understand the problem
//    TODO 1.2.2: where your data came from
//    TODO 1.2.3: what you used from your data
//    TODO 1.2.4: what analysis(analyses) you applied to your data
//    TODO 1.3: Include a glossary of terms if necessary
//    TODO 1.4: State any special requirements, dependencies, or steps to run the project

//        This code creates two different CSVreaders to read our files
        CSVReaderHeaderAware reader = new CSVReaderHeaderAware(new FileReader("FEDFUNDS.csv"));
        CSVReaderHeaderAware reader2 = new CSVReaderHeaderAware(new FileReader("INTDSRUSM193N.csv"));

//        This creates a file writer and an output stream that will write to the file "result.csv"
        FileOutputStream fos = new FileOutputStream("result.csv", true);
        PrintWriter pw = new PrintWriter(fos);

//        This code prints out the main menu to the console.
        System.out.println("Enter a number to choose an option:");
        System.out.println("1. Print a list of months where the federal funds rate was greater than the federal reserve discount rate");
        System.out.println("2. Print a list of months where the federal reserve discount rate was greater than the federal funds rate");
        System.out.println("3. Exit program");

//        Along with the code for the cases listed below, this code allows the user to choose an option from the menu.
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();


        switch (choice) {
            case 1:
                for (String[] nextLine : reader) {
                    // nextLine[] is an array of values from the line
                    pw.println(nextLine[0] + nextLine[1]);
                }

                System.out.println("Your file is ready! It is titled result.csv");
                break;
            case 2:
                for (String[] value : reader2) {
                    // nextLine2[] is an array of values from the line
                    for (String[] strings : reader) {
                        // nextLine[] is an array of values from the line
                        if (strings[0] == strings[0]) {
                            pw.println("Date: " + strings[0] + ". Federal Funds Rate: " + strings[1]);
                        }
//                    pw.println("Date: " + nextLine2[0] + ". Discount Rate: " + nextLine2[1]);
                    }
                }
                System.out.println("Your file is ready! It is titled result.csv");
                break;
            default:
                System.out.println("Exiting");
                System.exit(0);
        }

        pw.close();


//        For reader.date == reader2.date && FEDFUNDS > Discount Rate
//          print "Date: " + date + ". Federal Funds Rate: " + discountRate

//        For reader.date == reader2.date && FEDFUNDS < Discount Rate
//          print "Date: " + date + ". Federal Funds Rate: " + discountRate



//    TODO 2: Find or create any two data sets of your choosing that your application will read from. Acceptable formats include JSON, CSV, txt, SQL database.
//    TODO 2.1: Import all or a subset of this data

//    TODO 3: Application must write data TO A FILE distinct from those from which the information is imported

//    TODO 4: The application must allow the user to interact with the data, e.g. via a command-line console application, e.g. 'press 1 to view ... press 2 to view ...'

//    TODO 5: Your code must include comments

//    TODO 6: Project must be in its own repository on Github

    }

}
