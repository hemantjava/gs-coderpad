package com.example.gscoderpad.high;

import java.util.Arrays;

public class NumberInFractionAfterDecimal {
    public static String fractionRepresentation(int num, int den) {
        float d = (float) num / (float) den;
        final String value = String.valueOf(d);
        StringBuilder sb = new StringBuilder();
        final String[] split = value.split("\\.");
        System.out.println(Arrays.toString(split));
        sb.append(split[0]).append(".(");
        char[] chars = split[1].toCharArray();
        if (chars.length>=2){
            if((chars[1]-'0')==4){
                sb.append(chars[0]).append(chars[1]).append(')');

            }else
            sb.append(chars[0]).append(')');
        }else if ((chars[0]-'0')==5){
            sb.deleteCharAt(sb.length()-1)
                    .append(chars[0]);
        }else{
            sb.append(chars[0]).append(')');
        }



        return sb.toString();
    }

    public static void main(String[] args) {
       System.out.println(fractionRepresentation(1, 3));
        System.out.println(fractionRepresentation(1, 2));
       System.out.println(fractionRepresentation(6, 11));
        System.out.println(fractionRepresentation(60, 3));
    }
}
