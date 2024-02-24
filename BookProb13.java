/*
 *  File: BookProb13.java
 *  Author: Seraphina Morrison
 *  Created: 02/24/2024
 *  Description: An example program at 1301 level to show how to 
 *  			 extract a char from user input and an example
 *  			 of fall through behavior in switch statements
 */
package chapter4;

import java.util.Scanner;

public class BookProb13 {
	public static void main(String[] args) {
		// Initialize variables and create scanner object for user input
		Scanner input = new Scanner(System.in);
		String message = "";
		
		// Prompt user and store data
		System.out.print("Please enter a letter: ");
		char letter = input.next().charAt(0);
		
		// If statement to check range
		if ((letter >= 'a' && letter <= 'z') || letter >= 'A' && letter <= 'Z') {
			// Switch statement with fall through behavior
			switch (letter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				// Modifies the message sent to console at end of program
				message = "is a vowel";
				break; // Stops fall through behavior
			default:
				// If not char within range listed above
				message = "is not a vowel";
			}
		} else {
			// If it is not an alphabetical letter
			message = "is an invalid input";
		}
		// Print results to console
		System.out.printf("%c %s", letter, message);
	}
}
