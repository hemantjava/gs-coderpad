package com.example.gscoderpad.low;

public class PascalTriangle {

    private static void printTriangle(int num) {
        for (int line = 1; line <= num; line++) {
            int count = 1;
            System.out.print(space(num - line));
            for (int col = 1; col <= line; col++) {
                System.out.print(count + "  ");
                count = count * (line - col) / col;


            }//for

            System.out.println();

        }//for
    }

    private static void pascal(int n) {

        int[][] array = new int[n][n];

        for (int line = 0; line < n; line++) {

            for (int col = 0; col <= line; col++) {

                if (col == 0 || line == col)
                    array[line][col] = 1;
                else
                    array[line][col] = array[line - 1][col - 1] + array[line - 1][col];

                System.out.print(array[line][col] + " ");

            }//for
            System.out.println();

        }//for

        System.out.println(array[4][2]);
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("----------------------------");
        pascal(5);
    }

    private static String space(int sp) {
        StringBuilder sb = new StringBuilder();
        for (int i = sp; i >= 1; i--) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
