package edu.pitt.pao36.lab2;

import java.util.Scanner;

public class cupcake {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How may cupcakes did you eat?");
		int answer = Integer.parseInt(keyboard.next());
		
		 final int cupCakeCalorie = 130 ;
		 int totalCaloriesConsumed = 130 * answer;
		 System.out.printf("You ate a total of %d calories ", totalCaloriesConsumed);


	}

}
