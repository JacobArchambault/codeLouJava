package com.jacobarchambault.codeloujava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReaderHeaderAware;

public class FedFundsCSV {
	static List<String[]> read() throws IOException,
			FileNotFoundException {
		CSVReaderHeaderAware reader = new CSVReaderHeaderAware(
				new FileReader(
						"FEDFUNDS.csv"));
		List<String[]> fedFunds = reader.readAll();
		return fedFunds;
	}

}
