
/*
 * Lab 5 by Victoria Rush
 * April 26, 2018
 */

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cont;
		int userNum;
		long factorial = 1;
		
		System.out.println("Welcome to the Factorial Calcuator!");
		System.out.println();
		
		do {
			System.out.println("Enter an integer that's greater than 0 but less than 10: ");
			userNum = scan.nextInt();
			
			while (userNum < 0 || userNum > 10) {
				System.out.println("Number not in range, please try again. ");
				userNum = scan.nextInt();		
			}
			for (int i = 1; i <= userNum; i++) {
				factorial = factorial * i;
			}
			System.out.println("The factorial of " + userNum + " is " + factorial);
			System.out.println("Continue? ");
			cont = scan.next();
			factorial = 1;
			
		} while (cont.equalsIgnoreCase("y"));
		
		System.out.println("Thanks for playing.");
		scan.close();
	}

}
