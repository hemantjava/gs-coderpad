package com.example.gscoderpad.low;

import java.util.*;

public class LongestUniformSubstring {
    public static void main(String[] args) {
        System.out.println(longestUniformSubstring("abbbccda"));
    }
    private static String longestUniformSubstring(String str) {
        List list = new LinkedList();
        String temp = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                temp = temp + str.charAt(i);
                continue;
            }else{
                temp = temp + str.charAt(i-1);
            }
            list.add(temp);
            temp = "";
        }
        list.add(temp);
        System.out.println(list );
        return null;
    }
}
