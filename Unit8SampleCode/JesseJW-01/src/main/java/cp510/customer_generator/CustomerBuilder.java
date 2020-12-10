package cp510.customer_generator;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cp510.exercises.Address;
import cp510.exercises.Customer;

public class CustomerBuilder
{
    private final List<Customer>    customers  = new ArrayList<>();
    public static void main(String[] args)
    {
        List<Customer>  customers   = new CustomerBuilder().execute();
        customers.forEach( a -> System.out.println( a ) );
    }

    public List<Customer> execute()
    {
        ClassLoader loader  = getClass().getClassLoader();
        URL         url     = loader.getResource( "names.txt" );
        System.out.println( url );
        if ( url == null )
            throw new NullPointerException( url + " not found" );
        parse( url );
        return customers;
    }
    
    private void parse( URL url )
    {
        Random          randy       = new Random( 1 );
        List<Address>   addresses   = new AddressReader().execute();
        List<String>    names       = new NameReader().execute();
        while ( !addresses.isEmpty() && !names.isEmpty() )
        {
            int         addressInx  = randy.nextInt( addresses.size() );
            int         nameInx     = randy.nextInt( names.size() );
            Address     address     = addresses.remove( addressInx );
            String      name        = names.remove( nameInx );
            String[]    fields      = name.split( "," );
            if ( fields.length < 2 )
                throw new ParseException( "Invalid name tokens: " + name );
            Customer    customer    =
                new Customer( fields[0], fields[1], address );
            customers.add( customer );
        }
    }
}
