import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * Q2) There is a water tank of capacity 100 litres. Water is filled into it
		 * using bucket which have capacity of 10 litres. Write a program which fills
		 * the tank to its capacity using these buckets. Also include a mechanism in
		 * your program to stop the tank from over flowing.
		 */

		double tankCap = 0; // capacity 100liters

		Scanner scan = new Scanner(System.in);
		System.out.println("Fill water");  // input for console

		tankCap = scan.nextDouble();
		
		while (tankCap <= 100) {
			System.out.println("tank is at: " + tankCap + " liters");
			System.out.println("left in the tank: " + (100 - tankCap) + " liters");

			if (tankCap >= 90 && tankCap <= 100) {
				System.out.println("Tank may overflow");
			} else if (tankCap == 0) {
				System.out.println("Tank is empty");
			}
			break;
		}

	}

}
