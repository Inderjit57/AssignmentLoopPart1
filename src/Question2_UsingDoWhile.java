import java.util.Scanner;

public class Question2_UsingDoWhile {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		// input in the console will be from 10 to 100; 10,20,30....100.
		// 1 bucket = 10liters
		System.out.println("Enter bucket value in increments of 10; 1 bucket = 10liters. So enter: 10,20,30....100");

		double bucketVolume = scan.nextDouble();	//Bucket capacity is 10liters 

		do {
			System.out.println("tank is at: " + bucketVolume + " liters");
			System.out.println("Tank capacity left: " + (100 - bucketVolume) + " liters"); // Space left in the tank

			if (bucketVolume >= 90 && bucketVolume <= 100) {
				System.out.println("Tank may overflow");
			} else if (bucketVolume == 0) {
				System.out.println("Tank is empty");
			}
			break;
		} while (bucketVolume <= 100);

	}

}
