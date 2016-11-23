/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;


public class CheckerboardKarel_v3 extends SuperKarel {
	// You fill in this part
	//###############################	V3	###############################
	
	public void run() {
		putBeepers();
		populate();
	}
	
	private void populate() {
		boolean oddRow = beepersPresent();
		navigate();
		
		if (frontIsClear()) {
			if (oddRow) {
				putBeepersOdd();
			} else {
				putBeepers();
			}
			populate();
		}
	}
	
	private void navigate() {
		rotateToNorth();
		if (frontIsClear()) {
			if (rightIsBlocked()) {
				repositionForRowToWest();
			} else {
				repositionForRowToEast();
			}
		}
	}
	
	private void putBeepers() {
		int i = 0;
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
	
	private void putBeepersOdd() {
		int i = 0;
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
	
	private void rotateToNorth() {
		while (notFacingNorth()) {
			turnLeft();
		}
	}
	
	private void repositionForRowToWest() {
		move();
		turnLeft();
	}

	private void repositionForRowToEast() {
		move();
		turnRight();
	}
}
