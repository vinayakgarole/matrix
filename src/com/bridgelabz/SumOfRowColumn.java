package com.bridgelabz;

import java.util.Scanner;

public class SumOfRowColumn {
    public static void main(String[] args) {

        int i, j, rows, columns, isEqual = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first matrix rows and columns: ");
        rows = sc.nextInt();
        columns = sc.nextInt();

        int[][] x = new int[rows][columns];
        int[][] y = new int[rows][columns];

        System.out.println("Enter the matrix items: ");

        for (i=0; i<rows; i++) {

            for (j=0; j<columns; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix items: ");

        for (i=0; i<rows; i++) {

            for (j=0; j<columns; j++) {
                y[i][j] = sc.nextInt();
            }
        }

        for (i=0; i<x.length; i++) {

            for (j=0; j<x[0].length; j++) {

                if (x[i][j] != y[i][j]) {
                    isEqual = 0;
                    break;
                }
            }
        }

        if (isEqual == 1) {
            System.out.println("Matrix x is Equal to Matrix y");
        } else {
            System.out.println("Matrix x is not Equal to Matrix y");
        }
    }
}