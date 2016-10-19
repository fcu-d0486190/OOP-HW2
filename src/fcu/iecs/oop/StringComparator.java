package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while(true){
			System.out.println("Enter a string 1:");
			String st1 = keyboard.nextLine();
			System.out.println("Enter a string 2:");
			String st2 = keyboard.nextLine();
			st1 = st1.toUpperCase();
			st2 = st2.toUpperCase();
			if(st1.equals(st2))
				break;
		}
			System.out.println("The two strings are the same.");

	}

}
