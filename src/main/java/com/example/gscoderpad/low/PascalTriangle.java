package com.example.gscoderpad.low;

public class PascalTriangle {

    private static void printTriangle(int num) {
        for(int line = 1; line<= num; line++){
            int count = 1;
            for(int col = 1; col<=line; col++){

                System.out.print(count+"  ");
                count = count*(line-col)/col;


            }//for
            System.out.println();

        }//for
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
