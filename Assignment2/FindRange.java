/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;


public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL = 0;
	private static int maxNum = SENTINEL;
	private static int minNum = SENTINEL;
	
	public void run() {
		/* You fill this in */
		intro();
		inputValues();
		printResult();
	}
	
	
	private void intro() {
		println("This program finds smallest and largest numbers.");
	}

	private void inputValues() {
		while(true) {
			int input = readInt(" ? ");
			if (input == SENTINEL) {
				break;
			}
			
			if (input > maxNum) {
				maxNum = input;	
			} 
			if (input < minNum || minNum == SENTINEL) {
				minNum = input;
			}
		}
	}

	private void printResult() {
		if (minNum == SENTINEL) {
			println("No values entered.");
			
		} 
		else {
			println("smallest: " + minNum);
			println("largest: " + maxNum);
			
			if (minNum == maxNum) {
				println("You are the Alpha and the Omeaga!");
				
			}
		}
	}
}
