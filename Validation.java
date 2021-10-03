package io;
/*
 *reader()
 *readLine()
 *writer()
 *printf()
 *readPassword()
 *format()
 *flush() 
 */

import java.io.Console;
import java.io.IOException;
import java.io.Reader;

public class Validation {
	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {
			Reader reader = console.reader();
			try {
				int user = reader.read();
				char[] readPassword = console.readPassword();
				String pwd = new String(readPassword);
				if (pwd.equals("aastha")) {
					System.out.println("Welcome");
				} else
					System.out.println("Invalid user name or password");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
