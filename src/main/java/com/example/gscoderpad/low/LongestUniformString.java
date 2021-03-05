package com.example.gscoderpad.low;

/**
 *
 *  e.g.
 *      for the input: "abbbccda" the longest uniform substring is "bbb"
 *      (which starts at index 1 and is 3 characters long).
 */

import java.util.*;

public class LongestUniformString {

    private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

    static int[] longestUniformSubstring(String input){

        if(input==null||input.length()==0){
            return new int[]{-1,0};
        }
        int longestStart = 0;
        int longestLength = 1;
        int count = 1;
        char[] chars = input.toCharArray();
        for (int i = 1; i < chars.length; i++) {

            if (chars[i]==chars[i-1]){
                count++;
                continue;
            }

            if (count>longestLength){
                longestLength = count;
                longestStart++;
                count = 1;
            }
        }

        return new int[]{ longestStart, longestLength };
    }

    public static void main(String[] args) {

       testCases.put("", new int[]{-1, 0});
       testCases.put("10000111", new int[]{1, 4});
       testCases.put("aabbbbbCdAA", new int[]{2, 5});

        boolean pass = true;
        for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
            int[] result = longestUniformSubstring(testCase.getKey());
            pass = pass && (Arrays.equals(result, testCase.getValue()));
        }
        if(pass){
            System.out.println("Pass!");
        } else {
            System.out.println("Failed! ");
        }
    }
}