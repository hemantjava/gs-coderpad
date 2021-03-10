package com.example.gscoderpad.high;

import java.util.*;

public class AverageGrade {
    public static void main(String[] args) {
        String[][] input  = { { "Rohan", "84" }, { "Sachin", "102" }, { "Ishan", "55" }, { "Sachin", "18" } };
        Map<String, List<Integer>> map = new HashMap<>();

        List<Integer> list;
        for (String[] str : input) {
            String name = str[0]; //0 index name
            int val = Integer.parseInt(str[1]); //i index value
            list = (map.containsKey(name))?map.get(name):new ArrayList<>();
            list.add(val);
            map.put(name, list);
            System.out.println(map);
        }

        int bestAvg = 0;
        for (String name : map.keySet()) {
            list = map.get(name);
            int sum = 0;
            for (Integer val : list) {
                sum += val;
            }
            int avg = sum / list.size();

            if (avg > bestAvg)
                bestAvg = avg;
        }
        System.out.println("Best Grade is: " + bestAvg);
    }
}
