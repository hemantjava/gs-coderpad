package com.example.gscoderpad.low;

public class PascalTriangle {

    private static void printTriangle(int a) {
        for (int line = 1; line <= a; line++) { //row
            int col = 1;
           // System.out.printf("%" + (a+1  - line) + "s", ""); //triangle space
            System.out.print(space(a+1-line));
            for (int i = 1; i <= line; i++) {  //column
                System.out.print(col + " ");
                col = col * (line - i) / i; //formula
            }
            System.out.println(); //new line
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
    }
    private static  String space(int sp){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sp; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
