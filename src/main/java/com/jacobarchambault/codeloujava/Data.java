package com.jacobarchambault.codeloujava;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Data {

	List<String[]> list1;
	List<String[]> list2;
	Writer writer;
	Data(List<String[]> list1, List<String[]> list2, Writer writer){
		this.list1 = list1;
		this.list2 = list2;
		this.writer = writer;
	}
	
	void write1() throws IOException {
		writer.write(
				"Date,Federal Funds Rate,Discount Rate\n");
		for (String[] ffl : list1) {
			for (String[] drl : list2) {
				// comparison code
				if (ffl[0].equals(
						drl[0])
						&& Float.parseFloat(
								ffl[1]) > Float.parseFloat(
										drl[1])) {
					writer.write(
							ffl[0] + "," + ffl[1] + "," + drl[1] +"\n");
					break;
				}
			}
		}
		writer.close();
	}

	void write2() throws IOException {
		writer.write(
				"Date,Federal Funds Rate,Discount Rate\n");
		for (String[] ffl : list1) {
			for (String[] drl : list2) {
				// comparison code
				if (ffl[0].equals(
						drl[0])
						&& Float.parseFloat(
								ffl[1]) < Float.parseFloat(
										drl[1])) {
					writer.write(
							ffl[0] + "," + ffl[1] + "," + drl[1] +"\n");
					break;
				}
			}
		}
		writer.close();
	}

}
