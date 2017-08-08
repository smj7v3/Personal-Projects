package smj7v3.arrayMaxFinder;

import java.util.Scanner;

public class arrayMaxFinderApp {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		double input1;
		double input2;
		
		System.out.print("Please enter a number: ");
		input1 = keyboard.nextDouble();
		
		System.out.print("Please enter another number: ");
		input2 = keyboard.nextDouble();

		arrayMaxFinder mf = new arrayMaxFinder(input1, input2);
		
		System.out.println("The maximum value entered is " + mf.getMaxVal());
	}
}
