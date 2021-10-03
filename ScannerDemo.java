package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	String fileName="src/Sneha.txt";
	try(Scanner sc=new Scanner(new FileReader(fileName))){
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
	}
	catch(FileNotFoundException e) {}
}
}
