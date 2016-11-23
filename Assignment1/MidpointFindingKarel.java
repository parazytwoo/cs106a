/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		fillUpRowWithBeepers();
		pickAllBeepersExceptMiddleOne();
		turnAround();
		move();
	}
	
	/*
	 * Pre-Condition: Karel is facing East go until end of row and put beeper on every corner
	 * Post-Condition: Karel is facing West and the row is full of beepers
	 */
	
	private void fillUpRowWithBeepers() {
		while (frontIsClear()) {
			putBeeper();
			move();
		}
		putBeeper();
		turnAround();
	}
	
	/*
	 * Pre-Condition: Karel is at the beginning of the row
	 * Post-Condition: Karel has reached the end of the row
	 */
	
	private void goToEndOfRow() {
		while (frontIsClear()) {
			move();
		}
		turnAround();
	}
	
	/*
	 * Pre-Condition: Karel is facing West and the row is full of beepers
	 * Post-Condition: Karel is in the middle of the row and picked up all beepers
	 */
	
	private void pickAllBeepersExceptMiddleOne() {		
		if (beepersPresent()) {
			move();
			if (beepersPresent()) {
				moveBackward();
				if (beepersPresent()) {
					pickBeeper();
					goToEndOfRow();
					if (noBeepersPresent()) {
						while(noBeepersPresent()) {
							move();
						}			
					}
					pickAllBeepersExceptMiddleOne();
				}
			}
		}
	}
	
	private void moveBackward() {
		turnAround();
		move();
		turnAround();
	}
}
