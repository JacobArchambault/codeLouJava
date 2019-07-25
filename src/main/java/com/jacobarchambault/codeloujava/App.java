package com.jacobarchambault.codeloujava;

import com.opencsv.CSVIterator;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderHeaderAware;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException
    {

//    TODO 1: include README:
//    TODO 1.1: Explain what problem you are solving or question you are answering
//    TODO 1.2: Explain how you achieved your solution, including:
//    TODO 1.2.1: background information necessary to understand the problem
//    TODO 1.2.2: where your data came from
//    TODO 1.2.3: what you used from your data
//    TODO 1.2.4: what analysis(analyses) you applied to your data
//    TODO 1.3: Include a glossary of terms if necessary
//    TODO 1.4: State any special requirements, dependencies, or steps to run the project

        CSVReader reader = new CSVReader(new FileReader("FEDFUNDS.csv"));
        for (Iterator<String[]> it = reader.iterator(); it.hasNext(); ) {
            String[] nextLine = it.next();
            // nextLine[] is an array of values from the line
            System.out.println(nextLine[0] + nextLine[1] + "etc...");
        }

        CSVIterator iterator = new CSVIterator(new CSVReader(new FileReader("INTDSRUSM193N.csv")));
        for (CSVIterator it = iterator; it.hasNext(); ) {
            String[] nextLine = it.next();
            // nextLine[] is an array of values from the line
            System.out.println(nextLine[0] + nextLine[1] + "etc...");
        }

//        For reader.date = iterator.date && FEDFUNDS > Discount Rate
//          print "Date: " + date + ". Federal Funds Rate: " + discountRate

//        For reader.date = iterator.date && FEDFUNDS < Discount Rate
//          print "Date: " + date + ". Federal Funds Rate: " + discountRate


//        This code prints out the main menu to the console.
        System.out.println( "Enter a number to choose an option:" );
        System.out.println("1. Print a list of months where the federal reserve discount rate was greater than the federal funds rate");
        System.out.println("2. Print a list of months where the federal funds rate was greater than the federal reserve discount rate");
        System.out.println("3. Exit program");

//    TODO 2: Find or create any two data sets of your choosing that your application will read from. Acceptable formats include JSON, CSV, txt, SQL database.
//    TODO 2.1: Import all or a subset of this data

//    TODO 3: Application must write data TO A FILE distinct from those from which the information is imported

//    TODO 4: The application must allow the user to interact with the data, e.g. via a command-line console application, e.g. 'press 1 to view ... press 2 to view ...'

//    TODO 5: Your code must include comments

//    TODO 6: Project must be in its own repository on Github

    }

}
