package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintToFile {
public static void main(String[] args) {
	PrintStream ps=null;
	try {
		ps=new PrintStream("log.text");
		throw new FileNotFoundException();
		//System.setOut(ps);
		//System.out.println("i am Swarna suffering from cold and fever");
		//System.out.println("aastha and sneha are friends");
		}catch(FileNotFoundException e) {
		System.setErr(ps);
		System.out.println("error occurs while reading");
		e.printStackTrace();
	}
}
}
