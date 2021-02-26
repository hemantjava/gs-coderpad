package com.example.gscoderpad.high;

public class NumberInFractionAfterDecimal {
    public static String fractionRepresentation(int num, int den) {
        float d = (float) num / (float) den;
        final String value = String.valueOf(d);
        StringBuilder sb = new StringBuilder();
        sb.append(value.substring(0, value.indexOf(".")+1));
        sb.append("(");
        sb.append(value.substring(value.indexOf(".")+1,value.indexOf(".")+3));
        sb.append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionRepresentation(1,3));
    }
}
