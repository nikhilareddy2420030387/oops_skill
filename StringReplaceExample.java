package oops_skill;

import java.util.Scanner;

public class StringReplaceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter old character: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);

        System.out.println("Result: " + str.replace(oldChar, newChar));

        sc.close();
    }
}

