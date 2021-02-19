package com.jacobarchambault.codeloujava;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredData implements IData {

	IData data;

	FilteredData(
			IData data) {
		this.data = data;
	}

	List<String[]> option1() throws IOException {
		return data.toArray()
				.stream()
				.filter(
						x -> Float.parseFloat(
								x[1]) > Float.parseFloat(
										x[2]))
				.collect(
						Collectors.toList());
	}

	List<String[]> option2() throws IOException {
		return data.toArray()
				.stream()
				.filter(
						x -> Float.parseFloat(
								x[1]) < Float.parseFloat(
										x[2]))
				.collect(
						Collectors.toList());
	}

	@Override
	public List<String[]> toArray() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
