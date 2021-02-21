package com.jacobarchambault.codeloujava;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class UserSelection implements Data {

	Data data;
	Menu menu;

	UserSelection(
			Menu menu,
			Data filteredData) {
		this.menu = menu;
		this.data = filteredData;
	}

	@Override
	public List<String[]> toList() throws IOException {
		switch (menu.selection()) {
		case "1":
			return option1();
		case "2":
			return option2();
		default:
			return data.toList();
		}
	}

	private List<String[]> option1() throws IOException {
		return data.toList()
				.stream()
				.filter(
						x -> Float.parseFloat(
								x[1]) > Float.parseFloat(
										x[2]))
				.collect(
						Collectors.toList());
	}

	private List<String[]> option2() throws IOException {
		return data.toList()
				.stream()
				.filter(
						x -> Float.parseFloat(
								x[1]) < Float.parseFloat(
										x[2]))
				.collect(
						Collectors.toList());
	}

}
