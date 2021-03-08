package com.example.gscoderpad.medium;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingCharacter {
    public static void main(String[] args) {

        System.out.println(missing("xrt"));


    }


    private static String  missing(String input) {
        StringBuffer sb = new StringBuffer();
        Set<Character> set = new LinkedHashSet<>();
        char[] ch = input.toLowerCase().toCharArray();

        for(char c:ch){
            set.add(c);
        }

        for(int i='a';i<='z';i++){

            if(!set.contains((char)i))
                sb.append((char)i);

        }
        return sb.toString();
    }



}