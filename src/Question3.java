
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Q3) Write a program that prompts the user to input a positive integer. It
		 * should then output a message indicating whether the number is a prime number
		 * or not.
		 * 
		 * Conditons for a prime number x>1 x%x == 0 x%1 == 0
		 * Every prime number is an odd number except number 2.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int number = sc.nextInt();

		// number which are not divisible by 2 and 3 
		//
		if (number % 2 != 0 && number % 3 != 0 && number > 1) {
			System.out.println(number + "  = Prime number");
		} else {
			System.out.println(number + "  = not Prime number");
		}

	}

}
