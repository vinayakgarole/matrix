package com.bridgelabz;

import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);

        /*
         * Data Input
         */
        System.out.println("Enter first matrix data: ");

        for (int i = 0; i < 2; i++) {        // Rows

            for (int j = 0; j < 2; j++) {    // Columns
                a[i][j] = sc.nextInt();
            }
        }

        /*
         * Data Input
         */
        System.out.println("Enter second matrix data: ");

        for (int i = 0; i < 2; i++) {        // Rows

            for (int j = 0; j < 2; j++) {    // Columns
                b[i][j] = sc.nextInt();
            }
        }

        /*
         * Print data
         */
        System.out.println("Enter first matrix ");

        for (int i = 0; i < 2; i++) {        // Rows

            for (int j = 0; j < 2; j++) {    // Columns
                System.out.println(a[i][j] +" ");
            }
        }

        /*
         * Print data
         */
        System.out.println("Enter second matrix ");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.println(b[i][j] +" ");
            }
        }

        /*
         * Addition data
         */
        System.out.println("Sum of two Matrix ");
        for (int i = 0; i < 2; i++) {    // Rows

            for (int j = 0; j < 2; j++) { // Columns
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j] +" ");
            }
            System.out.println();
        }
    }
}
