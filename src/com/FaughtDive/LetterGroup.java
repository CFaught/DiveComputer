// This is the Faught Dive computer letter calculator!
//Author: Caleb Faught
//Date: 6/27/15
//this is using the NAUI dive tables, and I claim no ownership except for the code in this class.

package com.FaughtDive;

public class LetterGroup {
	
	private String letter;
	private int correspondingNum;
	
	public String Diver(int depth, int bottomtime){
		//take depth and time to calculate ending diver letter.
		
		if(depth <= 40){
			//if depth was less than forty feet, find bottom time column.
			int[] timenum1 = {0, 5, 15, 25, 30, 40, 50, 70, 80, 100, 110, 130};
			//step through the time columns of dive table.
			int i;
			for(i = 0; i <= 11; i++){
				if(bottomtime <= timenum1[i]){
					//found column, break the loop.
					correspondingNum = i;
					break;
				}
			}
			switch(correspondingNum){
				case 1 : letter = "A";
				break;
				case 2 : letter = "B";
				break;
				case 3 : letter = "C";
				break;
				case 4 : letter = "D";
				break;
				case 5 : letter = "E";
				break;
				case 6 : letter = "F";
				break;
				case 7 : letter = "G";
				break;
				case 8 : letter = "H";
				break;
				case 9 : letter = "I";
				break;
				case 10 : letter = "J";
				break;
				case 11 : letter = "K";
				break;
			}
		
		}else if(depth <= 50){
			//if depth was less than fifty feet, find bottom time column.
			int[] timenum2 = {0, 10, 15, 25, 30, 40, 50, 60, 70, 80};
			//step through the time columns of dive table.
			int i;
			for(i = 0; i <= 8; i++){
				if(bottomtime <= timenum2[i]){
					//found column, break the loop.
					correspondingNum = i;
					break;
					}
			}
			switch(correspondingNum){
				case 1 : letter = "B";
				break;
				case 2 : letter = "C";
				break;
				case 3 : letter = "D";
				break;
				case 4 : letter = "E";
				break;
				case 5 : letter = "F";
				break;
				case 6 : letter = "G";
				break;
				case 7 : letter = "H";
				break;
				case 8 : letter = "I";
				break;
				case 9 : letter = "J";
				break;
			}	
			
			
		}else if(depth <= 60){
			//if depth was less than sixty feet, find bottom time column.
			int[] timenum3 = {0, 10, 15, 20, 25, 30, 40, 50, 55};
			//step through the time columns of dive table.
			int i;
			for(i = 0; i <= 8; i++){
				if(bottomtime <= timenum3[i]){
					//found column, break the loop.
					correspondingNum = i;
					break;
					}
			}
			switch(correspondingNum){
				case 1 : letter = "B";
				break;
				case 2 : letter = "C";
				break;
				case 3 : letter = "D";
				break;
				case 4 : letter = "E";
				break;
				case 5 : letter = "F";
				break;
				case 6 : letter = "G";
				break;
				case 7 : letter = "H";
				break;
				case 8 : letter = "I";
				break;
			}	
			
			
		}else if(depth <= 70){
			//if depth was less than seventy feet, find bottom time column.
			int[] timenum4 = {0, 5, 10, 15, 20, 30, 35, 40, 45};
			//step through the time columns of dive table.
			int i;
			for(i = 0; i <= 8; i++){
				if(bottomtime <= timenum4[i]){
					//found column, break the loop.
					correspondingNum = i;
					break;
					}
			}
			switch(correspondingNum){
				case 1 : letter = "B";
				break;
				case 2 : letter = "C";
				break;
				case 3 : letter = "D";
				break;
				case 4 : letter = "E";
				break;
				case 5 : letter = "F";
				break;
				case 6 : letter = "G";
				break;
				case 7 : letter = "H";
				break;
				case 8 : letter = "I";
				break;
			}	
			
			
		}else if(depth <= 80){
			//if depth was less than eighty feet, find bottom time column.
			int[] timenum5 = {0, 5, 10, 15, 20, 25, 30, 35};
			//step through the time columns of dive table.
			int i;
			for(i = 0; i <= 7; i++){
				if(bottomtime <= timenum5[i]){
					//found column, break the loop.
					correspondingNum = i;
					break;
					}
			}
			switch(correspondingNum){
				case 1 : letter = "B";
				break;
				case 2 : letter = "C";
				break;
				case 3 : letter = "D";
				break;
				case 4 : letter = "E";
				break;
				case 5 : letter = "F";
				break;
				case 6 : letter = "G";
				break;
				case 7 : letter = "H";
				break;
			}	
			
			
		}else if(depth <= 90){
			//if depth was less than ninety feet, find bottom time column.
			int[] timenum6 = {0, 5, 10, 12, 15, 20, 25};
			//step through the time columns of dive table.
			int i;
			for(i = 0; i <= 6; i++){
				if(bottomtime <= timenum6[i]){
					//found column, break the loop.
					correspondingNum = i;
					break;
					}
			}
			switch(correspondingNum){
				case 1 : letter = "B";
				break;
				case 2 : letter = "C";
				break;
				case 3 : letter = "D";
				break;
				case 4 : letter = "E";
				break;
				case 5 : letter = "F";
				break;
				case 6 : letter = "G";
				break;
			}	
			
			
		}else if(depth <= 100){
			//if depth was less than one hundred feet, find bottom time column.
			int[] timenum7 = {0, 5, 7, 10, 15, 20, 22};
			//step through the time columns of dive table.
			int i;
			for(i = 0; i <= 6; i++){
				if(bottomtime <= timenum7[i]){
					//found column, break the loop.
					correspondingNum = i;
					break;
					}
			}
			switch(correspondingNum){
				case 1 : letter = "B";
				break;
				case 2 : letter = "C";
				break;
				case 3 : letter = "D";
				break;
				case 4 : letter = "E";
				break;
				case 5 : letter = "F";
				break;
				case 6 : letter = "G";
				break;
			}	
			
			
		}else if(depth <= 110){
			//if depth was less than one hundred and ten feet, find bottom time column.
			int[] timenum8 = {0, 0, 5, 10, 13, 15};
			//step through the time columns of dive table.
			int i;
			for(i = 0; i <= 5; i++){
				if(bottomtime <= timenum8[i]){
					//found column, break the loop.
					correspondingNum = i;
					break;
					}
			}
			switch(correspondingNum){
				case 1 : letter = "B";
				break;
				case 2 : letter = "C";
				break;
				case 3 : letter = "D";
				break;
				case 4 : letter = "E";
				break;
				case 5 : letter = "F";
				break;
			}	
			
			
		}else if(depth <= 120){
			//if depth was less than one hundred and twenty feet, find bottom time column.
			int[] timenum9 = {0, 0, 5, 10, 12};
			//step through the time columns of dive table.
			int i;
			for(i = 0; i <= 4; i++){
				if(bottomtime <= timenum9[i]){
					//found column, break the loop.
					correspondingNum = i;
					break;
					}
			}
			switch(correspondingNum){
				case 1 : letter = "B";
				break;
				case 2 : letter = "C";
				break;
				case 3 : letter = "D";
				break;
				case 4 : letter = "E";
				break;
			}	
			
			
		}else if(depth <= 130){
			//if depth was less than one hundred and thirty feet, find bottom time column.
			int[] timenum10 = {0, 0, 5, 8};
			//step through the time columns of dive table.
			int i;
			for(i = 0; i <= 3; i++){
				if(bottomtime <= timenum10[i]){
					//found column, break the loop.
					correspondingNum = i;
					break;
					}
			}
			switch(correspondingNum){
				case 1 : letter = "B";
				break;
				case 2 : letter = "C";
				break;
				case 3 : letter = "D";
				break;
			}	
			
			
		}
	return letter;
	}
}
