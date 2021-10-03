package io;
/*
 * Note:-
 * 1.System class has out,in,error static field.
 * System.in is used to get the input from console
 * System.out is used to print the output on console.
 * System.error is used for issuing the error in case an I/aO exception occurs.
 * Q1.WAP which takes integer inputs from the console and sum those arguments.
 */
import java.io.IOException;
import java.util.Scanner;

public class IODemo {
public static void main(String[] args) {
	System.out.println("pratiksha type a character");
	try {
		int read = System.in.read();
		System.out.println(read);
	} catch (IOException e) {
		System.out.println("cannot read input "+e);
	}
	//way 2
	System.out.println("Enter your name");
	Scanner sc=new Scanner(System.in);
	String next=sc.next();
	System.out.println("your name is "+next);
	
	//way 3 Coming Soon...
}
}
