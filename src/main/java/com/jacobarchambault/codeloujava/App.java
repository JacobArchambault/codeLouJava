package com.jacobarchambault.codeloujava;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.opencsv.CSVReaderHeaderAware;
import com.opencsv.CSVWriter;

public class App {
	public static void main(
			String[] args) throws IOException,
			InputMismatchException {
		new CSV(
				new UserSelection(
						new Menu(
								new Scanner(
										System.in)),
						new CombinedData(
								new CSVReaderHeaderAware(
										new FileReader(
												"FEDFUNDS.csv")),
								new CSVReaderHeaderAware(
										new FileReader(
												"INTDSRUSM193N.csv")))),
				new CSVWriter(
						new BufferedWriter(
								new FileWriter(
										"result.csv")))).write();
		System.out.println(
				"Your file is ready! Here you go.");
		Desktop.getDesktop()
				.open(
						new File(
								"result.csv"));
	}
}