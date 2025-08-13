package oops_skill;

import java.util.Scanner;

public class StringImmutability {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First example
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        String s2 = s1; // s2 refers to the same object as s1 initially
        System.out.print("Enter text to append to first string: ");
        String append1 = sc.nextLine();

        s1 = s1.concat(append1); // Creates a new String object, s2 still refers to the old value
        System.out.println("After concatenation, s1 = " + s1);
        System.out.println("s2 still = " + s2);

        // Second example
        System.out.print("Enter another string: ");
        String s3 = sc.nextLine();

        System.out.print("Enter text to append without storing result: ");
        String append2 = sc.nextLine();

        s3.concat(append2); // This will NOT change s3 because Strings are immutable
        System.out.println("immutability: " + s3);

        sc.close();
    }
}

