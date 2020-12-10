package cp510;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousClassDemo1_1
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
        Arrays.sort( iArr, new Comparator<Integer>()
        {
            public int compare( Integer int1, Integer int2 )
            {
                return int2 - int1;
            }
        });
        
        return iArr;
    }
}
