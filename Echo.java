package io;

import java.io.Console;

public class Echo {

	public static void main(String[] args) {
		Console console = System.console();
		if(console==null) {
			System.out.println("we cannot execute this program from ide");
		}
	}

}
