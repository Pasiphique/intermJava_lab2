package edu.pitt.pao36.lab2;

import java.util.Scanner;

public class madlib {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name = keyboard.next();
		
		System.out.println("Name of a city: ");
		String city = keyboard.next();
		
		System.out.println("enter a number: ");
		int number = Integer.parseInt(keyboard.next());
		
		System.out.println("enter a floatin point number: ");
		float pointNumber = Float.parseFloat(keyboard.next());
		
		System.out.println("name  a profession:");
		String profession = keyboard.next();
		
		System.out.println("name an animal");
		String animal = keyboard.next();
		
		System.out.println("name of a famous person: ");
		String famousPerson = keyboard.next();
		
		System.out.println("There once was a person named "+name+" who lived in "+city+
		".\n At the age of "+number+" he went to the University of Pittsburgh and \n decided to study computer and information Science.\n "+
		name+" went on to work as a "+ profession+" making "+ pointNumber+" dollars per year.\n"+
		" Then, "+name+" adopted an "+animal+ " named "+ famousPerson+ " and lived happily ever after.");

	}

}
