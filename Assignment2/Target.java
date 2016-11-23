/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

/*This figure is simply three GOval objects, two red and one white, drawn in the correct
order. The outer circle should have a radius of one inch (72 pixels), the white circle
has a radius of 0.65 inches, and the inner red circle has a radius of 0.3 inches. The
figure should be centered in the window of a GraphicsProgram subclass.*/


public class Target extends GraphicsProgram {	
	
	private static final int N_CIRCLES = 3;
	private static final double OUTER_RADIUS = 72;
	
	
	public void run() {
		/* You fill this in. */
		drawTarget();
	}
	
	private void drawTarget() {

		int center_x = getWidth() / 2;
		int center_y = getHeight() / 2;
		double radius = OUTER_RADIUS;
		
		double band_width = OUTER_RADIUS / N_CIRCLES;
		System.out.println("Band width: " + band_width);
		
		Color color = Color.red;
		
		while (radius >= band_width) {
			double x = center_x - radius / 2;
			double y = center_y - radius / 2;
			
			GOval circle = new GOval(x, y, radius, radius);
			add(circle);

			circle.setColor(color);
			circle.setFilled(true);
			circle.setFillColor(color);

			if (color == Color.red) {
				color = Color.white;
			} else {
				color = Color.red;
			}

			System.out.println("Circle object: " + circle);
			radius -= band_width;
		}
	}
}
