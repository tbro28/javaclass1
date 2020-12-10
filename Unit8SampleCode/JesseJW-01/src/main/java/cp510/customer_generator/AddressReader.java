package cp510.customer_generator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import cp510.exercises.Address;

public class AddressReader
{
    private final List<Address> addresses   = new ArrayList<>();
    public static void main(String[] args)
    {
        List<Address>   addresses = new AddressReader().execute();
        addresses.forEach( a -> System.out.println( a ) );
    }

    public List<Address> execute()
    {
        ClassLoader loader  = getClass().getClassLoader();
        URL         url     = loader.getResource( "addresses.txt" );
        System.out.println( url );
        if ( url == null )
            throw new NullPointerException( url + " not found" );
        initParse( url );
        return addresses;
    }
    
    private void initParse( URL url )
    {
        try (FileReader      fReader = new FileReader( url.getFile() );
             BufferedReader  reader  = new BufferedReader( fReader );
            )
        {
            String          line    = null;
            while ( (line = reader.readLine()) != null )
                if ( line.contains( "{" ) )
                    parse( line, reader );
            
        }
        catch ( IOException exc )
        {
            exc.printStackTrace();
            System.exit( 1 );
        }
    }
    private void parse( String line, BufferedReader reader )
    {
        try
        {
            String  streetLine  = reader.readLine();
            if ( !streetLine.contains( "address" ) )
                throwParseException( "address", streetLine );
            
            String  cityLine    = reader.readLine();
            if ( !cityLine.contains( "city" ) )
                throwParseException( "city", cityLine );
            
            String  stateLine   = reader.readLine();
            if ( !stateLine.contains( "state" ) )
                throwParseException( "state", stateLine );
            
            String  zipLine     = reader.readLine();
            if ( !zipLine.contains( "zip" ) )
                throwParseException( "zip", zipLine );

            String  street      = parseVal( streetLine );
            String  city        = parseVal( cityLine );
            String  state       = parseVal( stateLine );
            String  zip         = parseVal( zipLine );
            Address address     = 
                new Address( street, city, state, zip );
            addresses.add( address );
        }
        catch ( IOException exc )
        {
            exc.printStackTrace();
            System.exit( 1 );
        }
    }
    
    private String parseVal( String strVal )
    {
        String[]    tokens  = strVal.split( "[:]" );
        if ( tokens.length != 2 )
            throw new ParseException( "Line format: wrong # tokens" );
        
        String      token   = tokens[1];
        int         fromInx = token.indexOf( "\"" ) + 1;
        if ( fromInx <= 0 )
            throw new ParseException( "Line format: missing left quote" );
        
        int         toInx   = token.indexOf( "\"", fromInx );
        if ( toInx <= 0 )
            throw new ParseException( "Line format: unbalanced quotes" );
        
        String  val = token.substring( fromInx, toInx ).trim();
        return val;
    }
    
    private void throwParseException( String exp, String act )
    {
        String  msg = "expected=" + exp + ", actual=" + act;
        throw new ParseException( msg );
    }
}
