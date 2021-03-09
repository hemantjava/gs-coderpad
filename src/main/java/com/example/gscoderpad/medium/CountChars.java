package com.example.gscoderpad.medium;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountChars {
    public static void main(String[] args) {
        String input = "â€œSSSSSTTPPQâ";
        countChars1(input);
        System.out.println(couCharacter("SSSSSTTPPQ"));
    }
    private static void countChars1(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length() ;) {
            int len =0;
            char c = s.charAt(i);
            while (i<s.length() && s.charAt(i)==c){
                    i++;
                    len++;
            }
            if (String.valueOf(c).matches("\\w")) {// [a-zA-Z0-9]
                sb.append(len);
                sb.append(c);
            }
            else
                sb.append(c);
        }
        System.out.println(sb.toString());
    }

    private static String couCharacter(String inputString){


        StringBuffer sb = new StringBuffer();
        Map<Character,Integer> map = new LinkedHashMap<>();

        inputString.chars().forEach(data->{

            map.merge((char)data,1,Integer::sum);

        });

        map.forEach((k,v)->{
            sb.append(v);
            sb.append(k);
        });

        return sb.toString();

    }
}
