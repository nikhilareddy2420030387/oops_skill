package oops_skill;

import java.util.Scanner;

public class StringCompareToExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("CompareTo result: " + str1.compareTo(str2));

        sc.close();
    }
}

