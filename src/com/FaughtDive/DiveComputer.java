// This is the Faught Dive computer!
//Author: Caleb Faught
//Date: 6/27/15
//
//To Do: make the gui, add surface interval class

package com.FaughtDive;

import java.util.Scanner;

public class DiveComputer {
	private static Scanner input;

	public static void main(String[] arguments){
		input = new Scanner(System.in);
		LetterGroup LetterGroupFirst = new LetterGroup();
		
		System.out.println("What was your maximum depth in feet? ");
		int depth = input.nextInt();
		System.out.println("What was your total time for the dive? (in whole minutes) ");
		int bottomtime = input.nextInt();
		
		LetterGroupFirst.Diver(depth, bottomtime);
		
	}
}