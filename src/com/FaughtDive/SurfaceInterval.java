package com.FaughtDive;

public class SurfaceInterval {
	private String newLetter;
	private int correspondingNum;
	
	public String SIT(String Letter, int surfaceInt){
		
		if(Letter == "A"){
			int[] surfaceTime = {0, 1440};
			int i;
			for(i = 0; i <= 1; i++){
				if(surfaceInt <= surfaceTime[i]){
					correspondingNum = i;
					break;
				}
			}
			switch(correspondingNum){
				case 1: newLetter = "A";
				break;
			}
		}else if(Letter == "B"){
			int[] surfaceTime = {0, 200, 1440};
			int i;
			for(i = 0; i <= 2; i++){
				if(surfaceInt <= surfaceTime[i]){
					correspondingNum = i;
					break;
				}
			}
			switch(correspondingNum){
				case 1: newLetter = "B";
				break;
				case 2: newLetter = "A";
				break;
			}
		}
		
		return newLetter;
	}
}
