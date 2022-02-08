package PalindromeTask;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		System.out.println("Please enter a number between 1 and 1000: ");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int num = input.nextInt(), reversedNumber = 0, remainder;
		int originalNum = num;
		while (num != 0) {
			remainder = num % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			num /= 10;
		}
		if (originalNum == reversedNumber) {
			System.out.println(originalNum + " is Palindrome.");
		} else {
			System.out.println(originalNum + " is not Palindrome.");
		}
	}
}
