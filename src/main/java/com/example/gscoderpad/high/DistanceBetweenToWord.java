package com.example.gscoderpad.high;

import java.util.LinkedHashMap;
import java.util.Map;

public class DistanceBetweenToWord {
    static int distance(String s, String w1, String w2) {
        Map<String, Integer> map = new LinkedHashMap<>();
        if (w1.equals(w2))
            return 0;
        final String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            map.put(split[i], i);
        }
        System.out.println(map);
        return   map.get(w2)-map.get(w1)-1;
    }

    public static void main(String[] args) {
        String s = "for geeks contribute practice";
        String w1 = "for" ;
        String w2 = "practice" ;

        System.out.print( distance(s, w1, w2) );
    }
}
