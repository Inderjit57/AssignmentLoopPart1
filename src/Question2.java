import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * Q2) There is a water tank of capacity 100 litres. Water is filled into it
		 * using bucket which have capacity of 10 litres. Write a program which fills
		 * the tank to its capacity using these buckets. Also include a mechanism in
		 * your program to stop the tank from over flowing.
		 */

		double bucketVolume = 0; // capacity 100liters

		Scanner scan = new Scanner(System.in);
		// input in the console will be from 10 to 100; 10,20,30....100.
		// 1 bucket = 10liters
		System.out.println("Enter bucket value in increments of 10. 1 bucket = 10liters. So its, 10,20,30....100"); 

		bucketVolume = scan.nextDouble();

		while (bucketVolume <= 100) {
			System.out.println("tank is at: " + bucketVolume + " liters");
			System.out.println("left in the tank: " + (100 - bucketVolume) + " liters");

			if (bucketVolume >= 90 && bucketVolume <= 100) {
				System.out.println("Tank may overflow");
			} else if (bucketVolume == 0) {
				System.out.println("Tank is empty");
			}
			break;
		}

	}

}
