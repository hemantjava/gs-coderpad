package com.example.gscoderpad.low;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNotRepeatingChar {
    public static void main(String[] args) {
        String[] inputs = {"apple", "racecars", "ababdc"};
        char[] outputs = {'a', 'e', 'd'};

        boolean result = true;
        for (int i = 0; i < inputs.length; i++) {
            result = result && getFirstNotRepeatingChar(inputs[i]) == outputs[i];
            if (!result)
                System.out.println("Test failed for: " + inputs[i]);
            else
                System.out.println("Test passed for: " + inputs[i]);
        }
    }

    private static char getFirstNotRepeatingChar(String str) {
        Map<Character, Boolean> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, false);
            else
                map.put(c, true);
        }
        System.out.println(map);
        for (char ch : map.keySet()) {
            if (map.get(ch))
                return ch;
        }
        return '0';
    }
}
