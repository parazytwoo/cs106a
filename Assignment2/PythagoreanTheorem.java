/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import java.awt.Component;
import acm.program.*;
//import java.awt.Graphics;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		println("Enter values to compute Pytagorean theorem.");	
		int a = readInt("a: ");
		int b = readInt("b: ");
		
		double c = Math.sqrt(a * a + b * b);
		println("c = " + c);
	}
}
