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
		
		//the first thing to calculate after a dive is the letter group based on depth
		//and time at depth. The class LetterGroup() does this with the arguments depth
		//and bottomtime. It then returns a string, letter, with the letter group.
		LetterGroup LetterGroup1 = new LetterGroup();
		
		System.out.println("What was your maximum depth in feet? ");
		int depth = input.nextInt();
		System.out.println("What was your total time for the dive? (in whole minutes) ");
		int bottomtime = input.nextInt();
		
		//LetterGroupFirst.Diver(depth, bottomtime);
		String Letter = LetterGroup1.Diver(depth, bottomtime);
		if(Letter == null){
			System.out.println("You are in need of a decompression stop for atleast 5 minutes at 15 feet.");
		}else {
			System.out.println("You are a "+ Letter +" Diver.");
		}
		
		
	}
}