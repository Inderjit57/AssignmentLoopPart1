		/*
		 * Q2) There is a water tank of capacity 100 litres. Water is filled into it
		 * using bucket which have capacity of 10 litres. Write a program which fills
		 * the tank to its capacity using these buckets. Also include a mechanism in
		 * your program to stop the tank from over flowing.
		 */
import java.util.Scanner;

public class Question2_UsingWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// input in the console will be from 10 to 100; 10,20,30....100.
		// 1 bucket = 10liters
		System.out.println("Enter bucket value in increments of 10; 1 bucket = 10liters. So enter: 10,20,30....100");

		double tankFillLevel = scan.nextDouble(); 

		while (tankFillLevel <= 100) {
			System.out.println("tank is at: " + tankFillLevel + " liters");
			System.out.println("Tank capacity left: " + (100 - tankFillLevel) + " liters"); // Space left in the tank

			if (tankFillLevel >= 90) {
				System.out.println("Tank is full");
			} else if (tankFillLevel == 0) {
				System.out.println("Tank is empty");
			}
			break;
		}

	}

}
