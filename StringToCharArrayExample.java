package oops_skill;

import java.util.Scanner;

public class StringToCharArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        System.out.println("Characters:");
        for (char c : chars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}

