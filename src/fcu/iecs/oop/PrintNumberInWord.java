package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int integer = keyboard.nextInt();
		switch (integer){
			case 1:
				System.out.println("The input integer is ¡§ONE¡¨.");
			    break;
			case 2:
				System.out.println("The input integer is ¡§two¡¨.");
			    break;
			case 3:
				System.out.println("The input integer is ¡§three¡¨.");
				break;
			case 4:
				System.out.println("The input integer is ¡§four¡¨.");
				break;
			case 5:
				System.out.println("The input integer is ¡§five¡¨.");
				break;
			case 6:
				System.out.println("The input integer is ¡§six¡¨.");
				break;
			case 7:
				System.out.println("The input integer is ¡§seven¡¨.");
				break;
			case 8:
				System.out.println("The input integer is ¡§eight¡¨.");
				break;
			case 9:
				System.out.println("The input integer is ¡§nine¡¨.");
				break;
			default:
				System.out.println("The input integer is ¡§OTHER¡¨.");
				break;
		
		
		
		
		}
				

	}

}
