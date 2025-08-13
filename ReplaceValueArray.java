package oops_skill;

import java.util.Scanner;

public class ReplaceValueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to replace: ");
        int oldVal = sc.nextInt();
        System.out.print("Enter new value: ");
        int newVal = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == oldVal) {
                arr[i] = newVal;
            }
        }

        System.out.println("Updated array:");
        for (int num : arr) {
            System.out.print(num + " ");
            sc.close();
        }
    }
}
