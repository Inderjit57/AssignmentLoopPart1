
public class Question2 {

	public static void main(String[] args) {
		/*
		 * Q2) There is a water tank of capacity 100 litres. Water is filled into it
		 * using bucket which have capacity of 10 litres. Write a program which fills
		 * the tank to its capacity using these buckets. Also include a mechanism in
		 * your program to stop the tank from over flowing.
		 */

		double tankCap = 0; // Tank Capacity is 100 liters
		double bucketCap = 10; // Bucket capacity is 10 liters

		while (tankCap <= 100) {
			bucketCap += 10;
			System.out.println("Tank Fill" + bucketCap);
		}
		System.out.println("Add more Water");

	}

}
