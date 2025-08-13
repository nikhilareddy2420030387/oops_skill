package oops_skill;

import java.util.Scanner;

public class StringFormatExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        String formatted = String.format("Welcome to %s!", name);
        System.out.println(formatted);

        sc.close();
    }
}

