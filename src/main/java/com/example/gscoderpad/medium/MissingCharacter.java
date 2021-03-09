package com.example.gscoderpad.medium;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

//find missing characters to make strings programming
public class MissingCharacter {
    public static void main(String[] args) {

        System.out.println(missing1("xrtlmp"));
    }


    private static String missing(String input) {
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

    private static String missing1(String input) {
        StringBuffer sb = new StringBuffer();

        IntStream.rangeClosed('a','z').forEach(
                x->{
                    char c = (char)x;
                    if(!input.contains(String.valueOf(c)))
                        sb.append(c);

                }

        );

        return sb.toString();
    }



}