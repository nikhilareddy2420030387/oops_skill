package oops_skill;
import java.util.Scanner;

public class Alphabet {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any one element: ");
		char ch = sc.next().charAt(0); 
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println("It is an alphabet");
		} else {
			System.out.println("Not an alphabet");
		}
		sc.close();
		

		
		
		
		
	}

}
