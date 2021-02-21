package com.jacobarchambault.codeloujava;

import java.io.IOException;
import java.util.List;
import com.opencsv.exceptions.CsvException;
public interface Data {
	List<String[]> toList() throws CsvException, IOException;
}
