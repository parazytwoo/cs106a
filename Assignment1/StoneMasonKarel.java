/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		while (frontIsClear()) {
			rotateToNorth();
			moveAndPutBeeper();
			reachBottom();
			goToNextColumn();
		}
		
		rotateToNorth();
		moveAndPutBeeper();
		reachBottom();
		rotateToEast();
	}
	
	// used for filling the Beeper gaps in the column
	private void moveAndPutBeeper() {
		while (frontIsClear()){
			if (noBeepersPresent()){
				putBeeper();
			} 	
			move();
		}
		if (noBeepersPresent()){
			putBeeper();
		} 
	}
	
	
	// used for reaching the bottom of the column
	private void reachBottom() {	
		if (notFacingSouth()) {
			rotateToSouth();
			while (frontIsClear()) {
				move();
			}
		}
	}
	
	// used for moving to next column
	private void goToNextColumn() {
		if (facingEast()) {
			for (int i = 0; i < 4; i++) {
				move();
			}
		} else {
			rotateToEast();
			goToNextColumn();
		}
	}
	
	// used for N/E/S/W orientation
	private void rotateToNorth() {
		while (notFacingNorth()) {
			turnLeft();
		}
	}
	
	private void rotateToEast() {
		while (notFacingEast()) {
			turnLeft();
		}
	}
	
	private void rotateToSouth() {
		while (notFacingSouth()) {
			turnLeft();
		}
	}
	
	private void rotateToWest() {
		while (notFacingWest()) {
			turnLeft();
		}
	}
}
