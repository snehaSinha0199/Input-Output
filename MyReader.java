package io;

import java.io.FileReader;
import java.io.IOException;

public class MyReader {
public static void main(String[] args) {
	String fileName="src/Sneha.txt";
	try {
		FileReader fr=new FileReader(fileName);
		int ch=0;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
	}catch(IOException e) {
		System.out.println("errors occurs while reading the file");
	}
	
}
}
