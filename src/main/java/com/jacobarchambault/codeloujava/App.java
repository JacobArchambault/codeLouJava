package com.jacobarchambault.codeloujava;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.opencsv.CSVReaderHeaderAware;

public class App {
	public static void main(
			String[] args) throws IOException,
			InputMismatchException {

//        This creates a file writer and an output stream that will write to the file "result.csv"
		Data data = new Data(
				new CSV(
						new CSVReaderHeaderAware(
								new FileReader(
										"FEDFUNDS.csv"))).read(),
				new CSV(
						new CSVReaderHeaderAware(
								new FileReader(
										"INTDSRUSM193N.csv"))).read(),
				new PrintWriter(
						new FileOutputStream(
								"result.csv",
								false)));

		switch (new Menu(
				new Scanner(
						System.in)).selection()) {
		case 1:
			data.write1();
			break;
		case 2:
			data.write2();
			break;
		default:
			System.out.println(
					"Exiting");
			System.exit(
					0);
		}

		System.out.println(
				"Your file is ready! It is titled result.csv");

	}

}