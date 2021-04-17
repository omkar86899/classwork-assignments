package game;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;

public class Guess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Guess the Number!");
		System.out.println("I am thinking of number between 1 to 10");
		int r=rd.nextInt(10);
		int num=0;
		int count = 0;
		do {
			System.out.print("Your Guess:");
			num = sc.nextInt();
			if(num>r)
			{
				System.out.println("too high");
			}
			else if(num<r)
			{
				System.out.println("too low");
			}
			count = count+1;
		}while(num!=r);
		System.out.println("you guessed it in "+count+" tries");
	}
}
