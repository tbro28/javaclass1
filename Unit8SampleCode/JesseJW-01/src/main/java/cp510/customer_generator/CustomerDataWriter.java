package cp510.customer_generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import cp510.exercises.Address;
import cp510.exercises.Customer;

public class CustomerDataWriter
{
    private static final String className   = "CustomerData";
    private static final String fileName    = className + ".java";
    private static final String listName    = "customerList";
    
    public static void main(String[] args)
    {
        execute();
    }
    
    private static void execute()
    {
        File            file    = new File( fileName );
        List<Customer>  list    = new CustomerBuilder().execute();
        try ( FileWriter fileWriter = new FileWriter( file);
              BufferedWriter bufWriter = new BufferedWriter( fileWriter );
            )
        {
            execute( bufWriter, list );
        }
        catch ( IOException exc )
        {
            exc.printStackTrace();
            System.exit( 1 );
        }
    }

    private static void 
    execute(BufferedWriter bufWriter, List<Customer> list)
        throws IOException
    {
        writeHead( bufWriter );
        for ( Customer cust : list )
        {
            Address         addr    = cust.getAddress();
            StringBuilder   bldr    = new StringBuilder();
            bldr.append( "        " ).append("addr = new Address(\"")
                .append( addr.getAddr() ).append( "\",\"" )
                .append( addr.getCity() ).append( "\",\"" )
                .append( addr.getState() ).append( "\",\"" )
                .append( addr.getZipCode() ).append( "\");");
            bufWriter.write( bldr.toString() );
            bufWriter.newLine();
            
            bldr = new StringBuilder();
            bldr.append( "        ").append( "cust = new Customer(\"" )
                .append( cust.getFirstName() ).append( "\",\"" )
                .append( cust.getLastName() ).append( "\"," )
                .append( "addr);" );
            bufWriter.write( bldr.toString() );
            bufWriter.newLine();
            
            bldr = new StringBuilder();
            bldr.append( "        ").append( listName + ".add(cust);");
            bufWriter.write( bldr.toString() );
            bufWriter.newLine();
        }
        writeTail( bufWriter );
    }

    private static void writeHead( BufferedWriter bufWriter )
        throws IOException
    {
        String[]    lines   =
        { 
            "package cp510.exercises;",
            "import java.util.List;",
            "import java.util.ArrayList;",
            "public class " + className,
            "{",
            "    private List<Customer> customerList = new ArrayList<>();" ,
            "    public List<Customer> getCustomerData()",
            "    {",
            "        Customer cust;",
            "        Address addr;"
        };
        for ( String line : lines )
        {
            bufWriter.write( line );
            bufWriter.newLine();
        }
    }

    private static void writeTail( BufferedWriter bufWriter )
        throws IOException
    {
        String[]    lines   =
        { 
            "        return customerList;",
            "    }",
            "}",
        };
        for ( String line : lines )
        {
            bufWriter.write( line );
            bufWriter.newLine();
        }
    }
}
