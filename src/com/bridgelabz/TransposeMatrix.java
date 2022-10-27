package com.bridgelabz;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array data:");

        for (int i=0; i<=1; i++) {

            for (int j=0; j<=1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array Matrix:");

        for (int i=0; i<=1; i++) {

            for (int j=0; j<=1; j++) {
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");

        for (int i=0; i<=1; i++) {

            for (int j=0; j<=1; j++) {
                System.out.println(a[j][i]);
            }
            System.out.println();
        }
    }
}
