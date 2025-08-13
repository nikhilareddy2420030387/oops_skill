package oops_skill;

import java.util.Scanner;

public class StringIsEmptyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Is empty: " + str.isEmpty());

        sc.close();
    }
}

