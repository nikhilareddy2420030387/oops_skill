package oops_skill;
import java.util.Scanner;

public class Vowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Not an alphabet");
        }

        sc.close();
    }
}


