package chapter5;

import java.util.Scanner;

public class PracticeProblem01 {
	public static void main(String[] args) {
		// Declare and initialize variables
		int evenCount = 0, totalCount = 0, validCount = 0, over50Count = 0, numberToCheck = 3;

		// Create Scanner object that reads user input
		Scanner input = new Scanner(System.in);

		// Do while loop with sentinel of -365
		do {
			// Prompt user and store value
			System.out.print("Please enter an integer 1 - 100 (-365 to stop): ");
			numberToCheck = input.nextInt();
			
			// Checks to see if the number is in range
			if (numberToCheck >= 1 && numberToCheck <= 100) {
				// Checks if number is even
				if (numberToCheck % 2 == 0) {
					// Increase by 1
					evenCount++;
				}
				
				// Checks if number is greater than or equal to 50
				if (numberToCheck <= 50) {
					// Increase by 1
					over50Count++;
				}
				validCount++;
			}
			// Increases by 1
			totalCount++;
		} while (numberToCheck != -365);
		
		System.out.printf("Even: %d\n50 or greater: %d\nValid entries: %d\nTotal entries: %d", evenCount, over50Count, validCount, totalCount);
	}
}
