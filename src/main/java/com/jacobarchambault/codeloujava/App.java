package com.jacobarchambault.codeloujava;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.List;

import com.opencsv.CSVReaderHeaderAware;

public class App {
	public static void main(
			String[] args) throws IOException,
			InputMismatchException {

//        This code creates two different CSVreaders to read our files, and lists of strings from those files
		List<String[]> fedFunds = FedFundsCSV.read();
		CSVReaderHeaderAware reader2 = new CSVReaderHeaderAware(
				new FileReader(
						"INTDSRUSM193N.csv"));
		List<String[]> discountRate = reader2.readAll();

//        This creates a file writer and an output stream that will write to the file "result.csv"
		PrintWriter pw = new PrintWriter(
				new FileOutputStream(
						"result.csv",
						false));

		switch (Menu.selection()) {
		case 1:
			pw.println(
					"Date,Federal Funds Rate,Discount Rate");
			for (String[] ffl : fedFunds) {
				for (String[] drl : discountRate) {
					// comparison code
					if (ffl[0].equals(
							drl[0])
							&& Float.parseFloat(
									ffl[1]) > Float.parseFloat(
											drl[1]))
						pw.println(
								ffl[0] + "," + ffl[1] + "," + drl[1]);
				}
			}
			break;
		case 2:
			pw.println(
					"Date,Federal Funds Rate,Discount Rate");
			for (String[] ffl : fedFunds) {
				for (String[] drl : discountRate) {
					// comparison code
					if (ffl[0].equals(
							drl[0])
							&& Float.parseFloat(
									ffl[1]) < Float.parseFloat(
											drl[1]))
						pw.println(
								ffl[0] + "," + ffl[1] + "," + drl[1]);
				}
			}
			break;
		default:
			System.out.println(
					"Exiting");
			System.exit(
					0);
		}

		System.out.println(
				"Your file is ready! It is titled result.csv");

		pw.close();
	}


}