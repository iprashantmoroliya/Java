/*
	Write a Java program to print 'Hello' on screen and your name on a separate line. 
*/

import java.util.*;

class HelloMyName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter you name: ");
		String name = scan.nextLine();
		System.out.println("Hello\n"+name);
	}
}

