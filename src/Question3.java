import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Q3) Write a program that prompts the user to input a positive integer. 
		 * It should then output a message indicating whether the number is a prime number or not.
		 * 
		 * Conditons or a prime number
		 * x>1
		 * x%x == 0
		 * x%1 == 0 
		 * prime number should only have two factors 
		 * X can’t be divided Y =0 
		 * If x divided by y the prime number should be greater then 0
		 * 
		 */		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number1 = sc.nextInt();
		
		while(number1 <=20) {
			if (number1%1 == 0 && number1%number1 == 0 && number1>1) {
				System.out.println("Prime number");
				number1 += 1;
			}
		}
		

	}

}
