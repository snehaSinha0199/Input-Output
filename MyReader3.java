package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyReader3 {
public static void main(String[] args) {
	String destination="src/Sneha.txt";
	String filename="src/Text.txt";
	try(BufferedReader br=new BufferedReader(new FileReader(filename));
			BufferedWriter bw=new BufferedWriter(new FileWriter(destination))){
		int ch=0;
		while((ch=br.read())!=-1) {
			System.out.println((char)ch);
			bw.write((char)ch);
		}
	}catch(FileNotFoundException e) {
		System.out.println("error occurs while readng the filename");
	}catch(IOException e) { 
		System.out.println("error occurs while reading file content");
	}
}
}
