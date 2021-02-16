package com.jacobarchambault.codeloujava;

import java.util.Scanner;

public class Menu {
	final Scanner scanner;
	public Menu(Scanner scanner) {
		this.scanner = scanner;
	}
	int selection() {
		print();
		// get user selection from menu
		int choice = scanner.nextInt();
		scanner.close();
		return choice;
	}
	private void print() {
		System.out.println(
				"Enter a number to choose an option:");
		System.out.println(
				"1. Print a list of months where the federal funds rate was greater than the federal reserve discount rate");
		System.out.println(
				"2. Print a list of months where the federal reserve discount rate was greater than the federal funds rate");
		System.out.println(
				"3. Exit program");
	}

}
