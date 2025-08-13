package oops_skill;

import java.util.Scanner;

public class StringEqualsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("EqualsIgnoreCase: " + str1.equalsIgnoreCase(str2));

        sc.close();
    }
}
