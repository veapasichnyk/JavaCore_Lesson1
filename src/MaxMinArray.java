public class MaxMinArray {
    public static void main ( String arg[] ) {
        int[] arr = { 2 , 4 , 5 , 6 , 90 , 7 , 6 , 34 };
        int max = arr[0];
        int min = arr[0];

        for ( int i = 0 ; i < arr.length ; i++ ) {
            if ( arr[ i ] > max ) {
                max = arr[ i ];
            }
        }
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if ( arr[ i ] < min ) {
                min = arr[ i ];
            }
        }
        System.out.println ( "Max = " + max + "\nMin = " + min );

    }
}
