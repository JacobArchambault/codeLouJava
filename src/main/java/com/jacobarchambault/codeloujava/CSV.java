package com.jacobarchambault.codeloujava;

import java.io.IOException;
import com.opencsv.CSVWriter;

public class CSV {

	Data data;
	CSVWriter writer;

	CSV(
			Data data,
			CSVWriter writer) {
		this.data = data;
		this.writer = writer;
	}

	void write() throws IOException {
		writer.writeNext(new String[]{
				"Date","Federal Funds Rate","Discount Rate"});
		writer.writeAll(
				data.toList());
		writer.close();
	}
}
