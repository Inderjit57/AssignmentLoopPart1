import java.util.Scanner;

public class Question2_UsingDoWhile {

	public static void main(String[] args) {
		/*
		 * Q2) There is a water tank of capacity 100 litres. Water is filled into it
		 * using bucket which have capacity of 10 litres. Write a program which fills
		 * the tank to its capacity using these buckets. Also include a mechanism in
		 * your program to stop the tank from over flowing.
		 */

		Scanner scan = new Scanner(System.in);

		// input in the console will be from 10 to 100; 10,20,30....100.
		// 1 bucket = 10liters
		System.out.println("Enter bucket value in increments of 10; 1 bucket = 10liters. So enter: 10,20,30....100");

		double tankFillLevel = scan.nextDouble(); // Bucket capacity is 10liters

		do {
			System.out.println("tank is at: " + tankFillLevel + " liters");
			System.out.println("Tank capacity left: " + (100 - tankFillLevel) + " liters"); // Space left in the tank

			if (tankFillLevel >= 90 && tankFillLevel <= 100) {
				System.out.println("Tank may overflow");
			} else if (tankFillLevel == 0) {
				System.out.println("Tank is empty");
			}
			break;
		} while (tankFillLevel <= 100);

	}

}
