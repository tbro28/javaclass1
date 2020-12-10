package cp510;

import java.util.Arrays;
import java.util.Comparator;

public class SortEx1
{
    private static String[] arr =
    {
        "Dog", "cat", "camel", "Aardvark", "Bison", "gerbil"
    };
    
public static void main( String[] args )
{
    Arrays.sort( arr, new Sorter() );
    System.out.println( Arrays.toString( arr ) );
}

private static class Sorter implements Comparator<String>
{
    @Override
    public int compare( String str1, String str2 )
    {
        return str1.compareToIgnoreCase( str2 );
    }        
}
}
