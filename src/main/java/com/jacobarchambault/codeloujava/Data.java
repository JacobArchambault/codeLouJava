package com.jacobarchambault.codeloujava;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

public class Data {

	List<String[]> list1;
	List<String[]> list2;
	PrintWriter writer;
	Data(List<String[]> list1, List<String[]> list2, PrintWriter writer){
		this.list1 = list1;
		this.list2 = list2;
		this.writer = writer;
	}
	
	void write1() {
		writer.println(
				"Date,Federal Funds Rate,Discount Rate");
		for (String[] ffl : list1) {
			for (String[] drl : list2) {
				// comparison code
				if (ffl[0].equals(
						drl[0])
						&& Float.parseFloat(
								ffl[1]) > Float.parseFloat(
										drl[1])) {
					writer.println(
							ffl[0] + "," + ffl[1] + "," + drl[1]);
					break;
				}
			}
		}
		writer.close();
	}

	void write2() {
		writer.println(
				"Date,Federal Funds Rate,Discount Rate");
		for (String[] ffl : list1) {
			for (String[] drl : list2) {
				// comparison code
				if (ffl[0].equals(
						drl[0])
						&& Float.parseFloat(
								ffl[1]) < Float.parseFloat(
										drl[1])) {
					writer.println(
							ffl[0] + "," + ffl[1] + "," + drl[1]);
					break;
				}
			}
		}
		writer.close();
	}

}
