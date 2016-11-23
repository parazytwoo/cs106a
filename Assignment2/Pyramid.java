/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		/* You fill this in. */
		drawPyramid();
	}
	
	private void drawPyramid() {
		for(int row = 0; row < BRICKS_IN_BASE; row++) {
			int bricksRow = BRICKS_IN_BASE - row;
			System.out.println("Bricks on current row: " + bricksRow);
			for(int brickNumber = 0; brickNumber < bricksRow; brickNumber++) {
				System.out.println("Brick Number: " + brickNumber);
				int x = getWidth() / 2 - (BRICK_WIDTH * bricksRow) / 2 + brickNumber * BRICK_WIDTH;
				System.out.println("Coordinate X: " + x);
				int y = getHeight() - BRICK_HEIGHT * (row + 1);
				System.out.println("Coordinate Y: " + y);
				
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
				System.out.println("BRICK DRAWN!");
			}	
		}
		System.out.println("PYRAMID COMPLETE!");
	}
}