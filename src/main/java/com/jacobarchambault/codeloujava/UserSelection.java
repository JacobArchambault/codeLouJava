package com.jacobarchambault.codeloujava;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class UserSelection implements IData {

	Menu menu;
	IData data;

	UserSelection(
			Menu menu,
			IData filteredData) {
		this.menu = menu;
		this.data = filteredData;
	}

	public List<String[]> toArray() throws IOException {
		switch (menu.selection()) {
		case "1":
			return option1();
		case "2":
			return option2();
		default:
			return data.toArray();
		}

	}

	private List<String[]> option1() throws IOException {
		return data.toArray()
				.stream()
				.filter(
						x -> Float.parseFloat(
								x[1]) > Float.parseFloat(
										x[2]))
				.collect(
						Collectors.toList());
	}

	private List<String[]> option2() throws IOException {
		return data.toArray()
				.stream()
				.filter(
						x -> Float.parseFloat(
								x[1]) < Float.parseFloat(
										x[2]))
				.collect(
						Collectors.toList());
	}

}
