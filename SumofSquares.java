package oops_skill;
import java.util.Scanner;
public class SumofSquares {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int sum = 0; 
		for(int i=0;i<=n;i++) {
			sum = sum +(i*i);
			
			
		}
		System.out.println("Sum of Squares = " + sum);
		sc.close();
	}

	
}
