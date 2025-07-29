package oops_skill;
import java.util.Scanner;

public class Ifelse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println(num + " is Even Number.");
			
			
		} else {
			System.out.println(num + " is Odd Number.");
		}
		sc.close();	
	}
	
	

}
