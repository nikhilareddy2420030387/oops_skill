package oops_skill;

import java.util.Scanner;

public class CharacterAccessAndLength {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("charAt(2): " + s.charAt(2));  
        System.out.println("length(): " + s.length()); 
        sc.close();
        }
}
