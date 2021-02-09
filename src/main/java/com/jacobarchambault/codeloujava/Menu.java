package com.jacobarchambault.codeloujava;

import java.util.Scanner;

public class Menu {
	static int selection() {
		// This code prints out the main menu to the console.
		System.out.println(
				"Enter a number to choose an option:");
		System.out.println(
				"1. Print a list of months where the federal funds rate was above the recorded average");
		System.out.println(
				"2. Print a list of months where the federal reserve discount rate was below the recorded average");
		System.out.println(
				"3. Print a list of months where the federal funds rate was greater than the federal reserve discount rate");
		System.out.println(
				"4. Print a list of months where the federal reserve discount rate was greater than the federal funds rate");
		System.out.println(
				"5. Exit program");

		// Along with the code for the cases listed below, this code allows the user to
		// choose an option from the menu.
		Scanner in = new Scanner(
				System.in);
		int choice = in.nextInt();
		in.close();
		return choice;
	}

}