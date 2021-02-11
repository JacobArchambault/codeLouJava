package com.jacobarchambault.codeloujava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

class CSV {
	CSVReader reader;
	CSV(CSVReader reader){
		this.reader = reader;
	}
	List<String[]> read() throws IOException,
			FileNotFoundException {
		List<String[]> fedFunds = reader.readAll();
		return fedFunds;
	}

}
