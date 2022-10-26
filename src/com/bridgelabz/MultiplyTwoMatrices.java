package com.bridgelabz;

import java.util.Scanner;

public class MultiplyTwoMatrices {
    public static void main(String[] args) {

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);

        /*
         * Data input
         */
        System.out.println("Enter first matrix data:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        /*
         * Data input
         */
        System.out.println("Enter second matrix data:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        /*
         * Print data
         */
        System.out.println("Enter first matrix ");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.println(a[i][j] + " ");
            }
        }

        /*
         * Print data
         */
        System.out.println("Enter second matrix ");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.println(b[i][j] + " ");
            }
        }

        /*
         * Multiplication data
         */
        System.out.println("Multiplication of two Matrix ");

        for (int i=0; i<2; i++) {

            for (int j=0; j<2; j++) {
                c[i][j] = a[i][j] * b[i][j];
                System.out.println(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}