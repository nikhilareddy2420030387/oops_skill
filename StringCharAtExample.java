package oops_skill;


import java.util.Scanner;

public class StringCharAtExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.println("Character at index " + index + ": " + str.charAt(index));

        sc.close();
    }
}
