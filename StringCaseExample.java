package oops_skill;

import java.util.Scanner;

public class StringCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Upper case: " + str.toUpperCase());
        System.out.println("Lower case: " + str.toLowerCase());

        sc.close();
    }
}
