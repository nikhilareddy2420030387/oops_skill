package oops_skill;

import java.util.Scanner;

public class SumofDigitsintoSingleDigit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);  // ✅ Correct way to create Scanner
		System.out.println("Enter n: ");
		int n = sc.nextInt();

		while (n > 9) {
			int sum = 0;
			while (n != 0) {
				int rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
		}
		
		System.out.println("Single digit: " + n);
		sc.close();  // optional, but good practice
	}
}
