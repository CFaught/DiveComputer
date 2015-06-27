// This is the Faught Dive computer!
//Author: Caleb Faught
//Date: 6/27/15
//
//To Do: make the gui

package com.FaughtDive;

import java.util.Scanner;

public class DiveComputer {
	public static void main(String[] arguments){
		//initializes the dive computer
		//first the program needs input for depth of first dive
		//and time on bottom of first dive.
		Scanner input = new Scanner(System.in);
		LetterGroup LetterGroupFirst = new LetterGroup();
		
		System.out.println("What was your maximum depth in feet? ");
		int depth = input.nextInt();
		System.out.println("What was your total time for the dive? (in decimal) ");
		int bottomtime = input.nextInt();
		
		LetterGroupFirst.Diver(depth, bottomtime);
		
	}
}