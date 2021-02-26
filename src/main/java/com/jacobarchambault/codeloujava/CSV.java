package com.jacobarchambault.codeloujava;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;

public interface CSV {
	void write() throws IOException,
			CsvException;
}
