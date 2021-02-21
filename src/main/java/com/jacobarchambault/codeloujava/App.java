package com.jacobarchambault.codeloujava;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVReaderHeaderAware;
import com.opencsv.CSVWriter;

public class App {
	public static void main(
			String[] args) {
		String outputFilePath = "result.csv";
		tryWrite(
				outputFilePath);
		System.out.println(
				"Your file is ready! Here you go.");
		tryOpen(
				outputFilePath);
	}

	private static void tryWrite(
			String outputFilePath) {
		try {
			new GuardedCSV(
					new FedReserveCSV(
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
													outputFilePath))))).write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void tryOpen(
			String outputFilePath) {
		try {
			Desktop.getDesktop()
					.open(
							new File(
									outputFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}