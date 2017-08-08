package smj7v3.fibonacci;

import java.util.Scanner;

public class fibonacci {		
	Scanner keyboard = new Scanner(System.in);	
	private double x = 1;
	private double y = 0;
	private double z;
		
	public void getFibonacci() {
		
		System.out.print("How many iterations would you like? ");
		double input = keyboard.nextDouble();
		
		for (int i = 0; i < input; i++ ) {
			z = x + y;
			y = x;
			x = z;
			System.out.println(z);
		}
		
	}

}
