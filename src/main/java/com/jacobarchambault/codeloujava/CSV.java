package com.jacobarchambault.codeloujava;

import java.io.IOException;

import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

public class CSV {

	CsvData data;
	CSVWriter writer;

	CSV(
			CsvData data,
			CSVWriter writer) {
		this.data = data;
		this.writer = writer;
	}

	void write() throws IOException, CsvException {
		writer.writeNext(
				new String[] { "Date", "Federal Funds Rate", "Discount Rate" });
		writer.writeAll(
				data.toList());
		writer.close();
	}
}
