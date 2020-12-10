package cp510.customer_generator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class NameReader
{
    private final List<String>  names   = new ArrayList<>();
    public static void main(String[] args)
    {
        List<String>   names = new NameReader().execute();
        names.forEach( a -> System.out.println( a ) );
    }

    public List<String> execute()
    {
        ClassLoader loader  = getClass().getClassLoader();
        URL         url     = loader.getResource( "names.txt" );
        System.out.println( url );
        if ( url == null )
            throw new NullPointerException( "names.txt: " + " not found" );
        parse( url );
        return names;
    }
    
    private void parse( URL url )
    {
        try (FileReader      fReader = new FileReader( url.getFile() );
             BufferedReader  reader  = new BufferedReader( fReader );
            )
        {
            String          line    = null;
            while ( (line = reader.readLine()) != null )
            {
                String[]    fields  = line.split( " " );
                if ( fields.length < 2 )
                    throw new ParseException( "Invalid input: " + line );
                String  name    = fields[0] + "," + fields[1];
                names.add( name );
            }
        }
        catch ( IOException exc )
        {
            exc.printStackTrace();
            System.exit( 1 );
        }
    }
}
