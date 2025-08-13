package oops_skill;

import java.util.Scanner;

public class SearchCountArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to search: ");
        int key = sc.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == key) count++;
        }

        if (count > 0)
            System.out.println(key + " found " + count + " times.");
        else
            System.out.println(key + " not found.");
        sc.close();
        
    }
}
