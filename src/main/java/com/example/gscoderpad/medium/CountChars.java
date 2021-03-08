package com.example.gscoderpad.medium;

public class CountChars {
    public static void main(String[] args) {
        String input = "â€œSSSSSTTPPQâ";
        countChars1(input);
    }
    private static void countChars1(String s) {
         char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length ;) {
            int len =0;
            char c = s.charAt(i);
            while (i<chars.length && chars[i]==c){
                    i++;
                    len++;
            }
            if (String.valueOf(c).matches("\\w"))
                System.out.print(""+len+c);
            else
                System.out.print(""+c);
        }
    }
}
