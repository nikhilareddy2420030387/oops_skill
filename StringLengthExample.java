package oops_skill;

import java.util.Scanner;

public class StringLengthExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length: " + str.length());

        sc.close();
    }
}
