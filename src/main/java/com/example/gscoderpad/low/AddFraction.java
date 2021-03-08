package com.example.gscoderpad.low;

public class AddFraction {
    /**
     * Given two fractions passed in as int arrays,
     * returns the fraction which is result of adding the two input fractions.
     */



    public static void main( String[] args ) {
        int[] result = addFractions( new int[]{ 2, 3 }, new int[]{ 1, 2 } );

        if( result[ 0 ] == 7 && result[ 1 ] == 6 ) {
            System.out.println( "Test passed." );
        } else {
            System.out.println( "Test failed." );
        }
    }

    private static int[] addFractions(int[] a, int[] b) {
        return (new int[] {a[0]*b[1]+a[1]*b[0],a[1]*b[1]});
    }
}
