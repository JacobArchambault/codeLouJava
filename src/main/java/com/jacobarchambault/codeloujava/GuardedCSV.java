package com.jacobarchambault.codeloujava;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;

public class GuardedCSV implements CSV {

	CSV csv;

	GuardedCSV(
			CSV csv) {
		this.csv = csv;
	}

	@Override
	public void write() {
		try {
			csv.write();
		} catch (IOException | CsvException e) {
			e.printStackTrace();
		}

	}

}
