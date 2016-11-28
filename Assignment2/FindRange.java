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
	
	public void run() {
		/* You fill this in */
		
		println("This program finds smallest and largest numbers.");
		int n = readInt(" ? ");
		int min = n;
		int max = n;
	
		while(true){
			if (min == SENTINEL){
				println("Not enough numbers.");
				break;
			} else {
				n = readInt(" ? ");
				if (n != SENTINEL){
					if (min > n){
						min = n;
					} else if (max < n){
						max = n;
					}
				} else {
					println("smallest: " + min);
					println("largest: " + max);
					
					if (min == max){
						println("You are the Alpha and Omega!");
					}
		
					break;
				}
			}
		}
	}
}