package io;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	System.out.println("Enter two numbers");
	Scanner sc=new Scanner(System.in);
	int input1 = sc.nextInt();
	int input2 = sc.nextInt();
	System.out.println(input1+input2);
	
}
}
