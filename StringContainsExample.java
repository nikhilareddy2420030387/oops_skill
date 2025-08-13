package oops_skill;

import java.util.Scanner;

public class StringContainsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter word to check: ");
        String word = sc.nextLine();

        System.out.println("Contains '" + word + "': " + str.contains(word));

        sc.close();
    }
}
