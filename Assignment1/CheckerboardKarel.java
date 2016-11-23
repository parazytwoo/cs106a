/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;


public class CheckerboardKarel extends SuperKarel {
	// You fill in this part
	public void run() {
		populate(true, true);
	}

	public void populate(boolean startsWithBeeper, boolean isGoingEast){

		boolean didFinishWithBeeper = putBeepers(startsWithBeeper);

		boolean canContinue;

		if (isGoingEast){
			canContinue = leftIsClear();
		} else {
			canContinue = rightIsClear();
		}

		if (!canContinue){
			return;
		} else {
			//move to next line
			if (isGoingEast){
				repositionForRowToWest();
			} else {
				repositionForRowToEast();
			}

			populate(!didFinishWithBeeper, !isGoingEast);
		}
	}

	private boolean putBeepers(boolean isOdd) {
		int i = isOdd? 1 : 0;
		for (; frontIsClear(); i++) {
			if ((i % 2) != 0) {
				putBeeper();
			}
			move();
		}
		if ((i % 2) != 0) {
			putBeeper();
		}
		return (i % 2) != 0;
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
