package Basics;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int originalNum = num;
		int sum = 0;
		int count = 0;

		// Calculate the number of digits
		int temp = originalNum;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}

		// Reset num to originalNum to use in the loop
		temp = num;
		while (temp > 0) {
			int digit = temp % 10;
			
			//alternative :
//			sum += Math.pow(digit, count);s
			// Calculate digit^count using a for loop
			int power = 1;
			for (int i = 0; i < count; i++) {
				power *= digit;
			}

			// Add the power to the sum
			sum += power;

			// Remove the last digit
			temp = temp / 10;
		}

		System.out.println("Calculated sum of digits raised to the power of number of digits: " + sum);

		if (sum == originalNum) {
			System.out.println(originalNum + " is an Armstrong number.");
		} else {
			System.out.println(originalNum + " is not an Armstrong number.");
		}

		// Close the scanner to avoid resource leaks
		sc.close();
	}
}
