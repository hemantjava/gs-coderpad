package com.example.gscoderpad.medium;

import java.util.*;
import java.util.stream.Collectors;

public class FindTopIpaddress {
    public static void main(String[] args) {
        String lines[] = new String[]{
                "10.0.0.1 - log entry 1 11",
                "10.0.0.1 - log entry 2 213",
                "10.0.0.2 - log entry 133132"};
        String result = findTopIpaddress(lines);

        if (result.equals("10.0.0.1")) {
            System.out.println("Test passed");

        } else {
            System.out.println("Test failed");

        }

    }

    private static String findTopIpaddress(String[] strs){
        Map<String,Integer> mapTemp = new HashMap<>();

        for(String str : strs){
            String[] split = str.split("-");
           /* if(mapTemp.containsKey(split[0].trim())){
                mapTemp.put(split[0].trim(),mapTemp.get(split[0].trim())+1);
            }else{
                mapTemp.put(split[0].trim(),1);
            }*/
            mapTemp.merge(split[0].trim(),1,Integer::sum);//(a,b)->(a+b)
        }

        String top = (String) mapTemp.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b)->b,LinkedHashMap::new)).keySet().toArray()[0];

        return top;
    }
}
