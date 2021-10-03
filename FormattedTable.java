package io;

import java.io.Console;

public class FormattedTable {
	public void line(Console console) {
		console.printf("..............................................\n");
	}

	public void printHeader(Console console) {
		console.printf("\t %s \t %s \n", "Name", "Marks");
	}

	public void printRow(Console console, String name, int marks) {
		console.printf("\t %s \t %d", name, marks);
	}

	public static void main(String[] args) {
		FormattedTable ft = new FormattedTable();
		Console c = System.console();
		//ft.line(c);
		//ft.printHeader(c);
		ft.printRow(c, "aastha", 77);
		ft.printRow(c, "swarna", 87);
		ft.printRow(c, "pratiksha", 97);
		ft.printRow(c, "sneha", 80);
	}
}
