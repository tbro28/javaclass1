package cp510;

import java.util.Arrays;

public class LambdaDemo4
{
    public static void main(String[] args)
    {
        Integer arr[]   = randomize( 10 );
        for ( Integer num : arr)
            System.out.printf( "%s%n", num );
    }

    // Returns an array of n random integers
    // sorted in reverse order
    public static Integer[] randomize( int num )
    {
        Integer iArr[] = new Integer[num];
        for ( int inx = 0 ; inx < num ; ++inx )
            iArr[inx] = (int)(Math.random() * 100 );
        Arrays.sort( iArr, (int1, int2) -> int2 - int1 );
        
        return iArr;
    }
}
