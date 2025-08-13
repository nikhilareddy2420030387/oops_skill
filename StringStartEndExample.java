package oops_skill;

import java.util.Scanner;

public class StringStartEndExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter start text: ");
        String startText = sc.nextLine();

        System.out.print("Enter end text: ");
        String endText = sc.nextLine();

        System.out.println("Starts with '" + startText + "': " + str.startsWith(startText));
        System.out.println("Ends with '" + endText + "': " + str.endsWith(endText));

        sc.close();
    }
}

