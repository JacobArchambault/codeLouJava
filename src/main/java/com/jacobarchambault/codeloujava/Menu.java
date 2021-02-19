package com.jacobarchambault.codeloujava;

import java.util.Scanner;

public class Menu {
	final Scanner scanner;
	public Menu(Scanner scanner) {
		this.scanner = scanner;
	}
	String selection() {
		print();
		// get user selection from menu
		String choice = scanner.next();
		scanner.close();
		return choice;
	}
	private void print() {
		System.out.println("Welcome to the federal reserve data center app.");
		System.out.println(
				"Enter a number to choose an option:");
		System.out.println(
				"To obtain a list of months where the federal funds rate was greater than the federal reserve discount rate, press 1.");
		System.out.println(
				"To obtain a list of months where the federal reserve discount rate was greater than the federal funds rate, press 2.");
		System.out.println(
				"To obtain a list of all combined federal funds rate and federal reserve discount rate data, press any other key.");
	}

}
