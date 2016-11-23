/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;


public class CheckerboardKarel_v2 extends SuperKarel {
	// You fill in this part
	
	// ###############################	V2	###############################
	
	public void run() {
		do {
			putBeepers1on1Odd();
			if (leftIsClear()) {
				repositionForRowToWest();
				goToEndOfRow();
			}
			putBeepers1on1Pair();
			if (leftIsClear()) {
				repositionForRowToWest();
				goToEndOfRow();
			}
		} while (frontIsClear());
	}

	private void putBeepers1on1Pair() {
		int i = 1;
		for (; frontIsClear(); i++) {
			if ((i % 2) == 0) {
				putBeeper();
			}
			move();
		}
		if ((i % 2) == 0) {
			putBeeper();
		}
	}

	private void putBeepers1on1Odd() {
		int i = 1;
		for (; frontIsClear(); i++) {
			if ((i % 2) != 0) {
				putBeeper();
			}
			move();
		}
		if ((i % 2) != 0) {
			putBeeper();
		}
	}
		
		
//	Pre-Condition: facing East at end of bottom row
//	Post-Condition: facing West at the beginning of the top row
		 
	private void goToEndOfRow() {
		while (frontIsClear()) {
			move();
		}
		turnAround();
	}

	private void repositionForRowToWest() {
		turnLeft();
		move();
		turnLeft();
	}

	private void repositionForRowToEast() {
		turnRight();
		move();
		turnRight();
	}
}	

	
	
		
	
	