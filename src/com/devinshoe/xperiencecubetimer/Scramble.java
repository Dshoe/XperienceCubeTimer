package com.devinshoe.xperiencecubetimer;

import java.util.Random;

/*
 * Devin Shoemaker
 * Scramble class
 * Used to generate scrambles for the following solve
 */

public class Scramble {
	
	// Method to generate a 3x3 scramble
	public static String ThreeByThree() {
		
		// String to hold the scramble
		String scramble = "";
		// Initialize random number generator
		Random randomGenerator = new Random();
		// Initialize int to hold the last side used in the scramble
		// Set to 6 so that the first move cannot conflict with it
		int lastSide = 6;
		// Initialize integer to hold the random number for the side
		int randomSide;
		// Initialize integer to hold a number for whether or not the move is prime
		boolean randomPrime;
		
		// Generate 30 random moves with a for loop
		for (int i = 0; i <= 30; i++) {
			// Generate random number between 0-5 for what side the move is for
			randomSide = randomGenerator.nextInt(5);
			// Generate random boolean for whether or not the move is prime
			randomPrime = randomGenerator.nextBoolean();
			
			// If the next move is the same as the last side, re-generate
			while (randomSide == lastSide)
				randomSide = randomGenerator.nextInt(5);
			lastSide = randomSide;
			
			// Switch statement to determine move for scramble from the random number
			switch (randomSide) {
				case 0: 	scramble += "F";
							break;
				case 1:		scramble += "B";
							break;
				case 2:		scramble += "U";
							break;
				case 3:		scramble += "D";
							break;
				case 4:		scramble += "L";
							break;
				case 5:		scramble += "R";
							break;
				default:	scramble += "";	
			}
			
			// If randomPrime is 1 then make the move prime
			if (randomPrime == true)
				scramble += "'";
			
			// If the move is not the last in the scramble then add a space
			if (i < 30)
				scramble += " ";
			
		}// End of for loop
		
		return scramble;
		
	}// End of 3x3Scramble

}// End of class
