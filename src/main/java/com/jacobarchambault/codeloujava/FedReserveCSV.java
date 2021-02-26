package com.jacobarchambault.codeloujava;

import java.io.IOException;

import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

public class FedReserveCSV implements CSV {

	CsvData data;
	CSVWriter writer;

	FedReserveCSV(
			CsvData data,
			CSVWriter writer) {
		this.data = data;
		this.writer = writer;
	}

	@Override
	public void write() throws IOException,
			CsvException {
		writer.writeNext(
				new String[] { "Date", "Federal Funds Rate", "Discount Rate" });
		writer.writeAll(
				data.toList());
		writer.close();
	}
}
