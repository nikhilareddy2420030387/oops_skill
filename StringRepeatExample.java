package oops_skill;

import java.util.Scanner;

public class StringRepeatExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter repeat count: ");
        int count = sc.nextInt();

        System.out.println(str.repeat(count));

        sc.close();
    }
}
