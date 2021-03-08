package com.example.gscoderpad.low;

public class PowerOfEachOther {

        public static void main(String[] args) {

            System.out.println(powerOfEachOther(3,3));
            System.out.println(powerOfEachOther1(3,3));

        }

        private  static boolean powerOfEachOther(int a,int b) {

            int powerA = 1;//9+81+

            for(int i=0;i<b;i++){
                powerA = powerA *a;
            }
            int powerB = 1;
            for(int i = 0; i<a;i++){
                powerB = powerB*b;
            }
            return (powerA == powerB);
        }

    private  static boolean powerOfEachOther1(int a,int b) {
        int powerA = (int)Math.pow(a, b);
        int powerB = (int)Math.pow(b,a);
        return (powerA==powerB);
    }

    }