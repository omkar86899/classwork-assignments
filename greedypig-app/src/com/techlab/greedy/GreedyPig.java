package com.techlab.greedy;

import java.util.Random;
import java.util.Scanner;

public class GreedyPig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Let's Play PIG\n* See how many turns it takes you to get to 20.\n* Turn ends when you hold or roll a 1.\n* If you roll a 1, you lose all points for the turn.\n* If you hold, you save all points for the turn.");
		int totalScore=0;
		int noOfTurns=0;
		int diceScore=0;
		int turnScore=0;
		String input="";
		do {
			System.out.println("TURN "+(noOfTurns+1));
			turnScore=0;
			do {
				System.out.print("Roll or hold? (r/h):");
				input = sc.next();
				if(input.equals("r")){
					diceScore=rd.nextInt(6)+1;
					System.out.println("Die: "+diceScore);
					if(diceScore!=1) {
						turnScore+=diceScore;
					}
					else {
						System.out.println("Turn over. No score.\n");
						turnScore=0;
					}
				}
			}while(input.equals("r")&&diceScore!=1);
			System.out.println("Score for turn: "+turnScore);
			totalScore+=turnScore;
			System.out.println("Total score: "+totalScore+"\n");
			noOfTurns+=1;
		}while(totalScore<20);
		System.out.println("You finished in "+noOfTurns+" Turns!\n");
		System.out.println("Game over!");
	}
}
