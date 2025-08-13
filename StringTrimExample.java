package oops_skill;

import java.util.Scanner;

public class StringTrimExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String str = sc.nextLine();

        System.out.println("Before Trim: [" + str + "]");
        System.out.println("After Trim: [" + str.trim() + "]");

        sc.close();
    }
}
