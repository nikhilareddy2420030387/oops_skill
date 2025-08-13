package oops_skill;

import java.util.Scanner;

public class MatrixTrace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int trace = 0;

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                if (i == j) trace += matrix[i][j]; // main diagonal
            }
        }

        System.out.println("Trace of matrix: " + trace);
        sc.close();
    }
}

