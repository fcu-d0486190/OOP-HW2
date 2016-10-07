package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string 1:");
		String st1 = keyboard.nextLine();
		System.out.println("Enter a string 2:");
		String st2 = keyboard.nextLine();
		st1 = st1.toUpperCase();
		st2 = st2.toUpperCase();
		if(st1==st2)
			System.out.println("The two strings are the same.");
		else
			System.out.println("The two strings are not the same.");

	}

}
