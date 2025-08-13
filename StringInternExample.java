package oops_skill;

import java.util.Scanner;

public class StringInternExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String interned = str.intern();
        System.out.println("Interned string: " + interned);

        sc.close();
    }
}

