package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HomeWork2 {
public static void main(String[] args) {
	String str="src/Sneha.txt";
	List<String> list1=new ArrayList<>();
	try(Scanner sc=new Scanner(new FileReader(str))){
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			list1.add(sc.next());
			
		}
		Map<String,Long> collect=list1.stream().collect(Collectors.groupingBy(String::toString,Collectors.counting()));
	}
	catch(FileNotFoundException e) {
		
	}
}
}
