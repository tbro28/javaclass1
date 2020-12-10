package cp510;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NestedClassDemo4
{
    public static void main(String[] args)
    {
        List<String>    list    = new ArrayList<>();
        list.add( "Abe" );
        list.add( "Zulu" );
        list.add( "alice" );
        list.add( "zebra" );
        list.add( "apple" );
        list.sort( new IgnoreCaseSorter() );
        for ( String str : list )
            System.out.println( str );
    }

    private static class IgnoreCaseSorter implements Comparator<String>
    {
        @Override
        public int compare(String str1, String str2)
        {
            return str1.compareToIgnoreCase( str2 );
        }
    }
}
