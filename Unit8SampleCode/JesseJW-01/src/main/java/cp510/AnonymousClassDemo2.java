package cp510;

import java.util.ArrayList;
import java.util.List;

public class AnonymousClassDemo2
{
    @SuppressWarnings("serial")
    private final List<String>  names   = new ArrayList<String>()
    {
        {
            add( "Spot" );
            add( "Jane" );
            add( "Sally" );
        }
        
        public void add( int num, String value )
        {
            String err = "Attempt to insert into append-only list";
            throw new Error( err );
        }
    };
    
    public static void main( String[] args )
    {
        new AnonymousClassDemo2().execute();
    }

    private void execute()
    {
        names.add( "Jehosophat" );
        for ( String name : names )
            System.out.println( name );
        names.add(  2, "Melnie" );
    }
}
