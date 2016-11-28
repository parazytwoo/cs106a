/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 * 
 * Pick some positive integer and call it n.
 * If n is even, divide it by two.
 * If n is odd, multiply it by three and add one.
 * Continue this process until n is equal to one
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		intro();
		inputValue();
		printResult();
	}
	
	int n;
	
	private void intro() {
		println("The program reads in a number from the user and then displays the Hailstone sequence for that number.");
	}
	
	private void inputValue() {
		n = readInt("Enter a number: ");
		if (n > 0 && n != 1) {
			printResult();
		} else {
			println("Your number is '1' or negative.");
			inputValue();
		}
	}
	
	private void printResult() {
		while(n != 1) {
			if(n % 2 != 0) {
				int odd = 3 * n + 1;
				println(n + " is odd, so I make 3n+1: " + odd);
				n = odd;
				
			} else {
				int even = n / 2;
				println(n + " is even, so I take half: " + even);
				n = even;			
			}
			printResult();		
		}
	}	
}
