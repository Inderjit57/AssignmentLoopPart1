import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/*
		 * Q1) A thermostat is used in home cooling /heating system. Write a program to
		 * set temperature of the thermostat by taking input from user from console.
		 * i.e. if the user wants to set the temp to 21 degrees Celsius, he will enter
		 * this value in console, your program should read it from console and print
		 * “Temp set to <value>” where value = temp entered by user in console.
		 */

		// Import Scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the desired temperature value");

		double temp = sc.nextDouble(); // Varaible for set temperature from console

		System.out.println("Temperature is set to: " + temp + "*");

	}

}
