package oops_skill;

import java.util.Scanner;

public class StringIndexExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to search: ");
        char ch = sc.next().charAt(0);

        System.out.println("Index of '" + ch + "': " + str.indexOf(ch));
        System.out.println("Last Index of '" + ch + "': " + str.lastIndexOf(ch));

        sc.close();
    }
}

