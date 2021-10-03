package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyReader2 {
public static void main(String[] args) {
	String fileName="src/Text.txt";
	String destination="src/Text.txt";
	FileReader fr=null;
	FileWriter fw=null;
	BufferedReader br=null;
	BufferedWriter bw=null;
	try {
		fr=new FileReader(fileName);
		fw=new FileWriter(destination);
		br=new BufferedReader(fr);
		bw=new BufferedWriter(fw);
		int ch=0;
		while((ch=br.read())!=-1) {
			System.out.println((char)ch);
			bw.write((char)ch);
		}
		bw.flush();
		
	}catch(FileNotFoundException e) {
		System.out.println("error occurs while reading the file");
	}catch(IOException i) {
		System.out.println("IOException");
	}finally {
		try {
			if(fw!=null) {
				fw.close();
			}
		
		if(fr!=null) {
			fr.close();
		}
		if(br!=null) {
			br.close();
		}
		if(bw!=null) {
			bw.close();
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
}
