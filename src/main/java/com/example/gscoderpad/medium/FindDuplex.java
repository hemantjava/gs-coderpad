package com.example.gscoderpad.medium;

public class FindDuplex {
    public static void main(String[] args) {
        int[] array = {12, 3, 4, 1, 6, 7,9};
        int sum = 19;
        if (findDuplex(array,sum)){
            System.out.println(" Founded elements");
        }else {
            System.out.println("Not found elements");
        }
    }

    private static boolean findDuplex(int[] array, int sum) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i+1; j < array.length; j++) {
                if (array[i]+array[j]==sum)
                {
                    System.out.printf(array[i]+" + "+array[j]+" == "+sum);
                    return true;
                }
            }
        }

        return false;
    }
}

