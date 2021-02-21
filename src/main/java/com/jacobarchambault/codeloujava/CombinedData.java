package com.jacobarchambault.codeloujava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.opencsv.CSVReader;

class CombinedData implements Data {
	CSVReader reader1;
	CSVReader reader2;
	
	CombinedData(CSVReader reader1, CSVReader reader2){
		this.reader1 = reader1;
		this.reader2 = reader2;
	}
	public List<String[]> toList() throws IOException{
		List<String[]> data1 = reader1.readAll();
		List<String[]> data2 = reader2.readAll();
		List<String[]> combinedCSVData = new LinkedList<String[]>();
		for (String[] line : data1) {
			for (String[] line2 : data2) {
				if (line[0].contains(line2[0])) {
					combinedCSVData.add(new String[] {line[0], line[1], line2[1]});
				}
			}
		}
		return combinedCSVData;
	}
	List<String[]> writeFirst() {
		List<String[]> combinedCSVData = new ArrayList<String[]>();
		for (String[] line : reader1) {
			combinedCSVData.add(line);
		}
		return combinedCSVData;
	}

}
