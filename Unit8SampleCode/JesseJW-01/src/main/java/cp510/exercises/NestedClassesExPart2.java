package cp510.exercises;

import java.util.Comparator;
import java.util.List;

public class NestedClassesExPart2
{
    public static void main(String[] args)
    {
        List<Customer>  customers   = CustomerData.getCustomerData();
        customers.sort( new Comparator<Customer>() {
            public int compare(Customer cust1, Customer cust2)
            {
                Address addr1   = cust1.getAddress();
                Address addr2   = cust2.getAddress();
                int rval    = addr1.getCity().compareTo( addr2.getCity() );
                if ( rval == 0 )
                    rval = addr1.getZipCode().compareTo( addr2.getZipCode() );
                return rval;
            }
        });

        customers.sort( new Comparator<Customer>() {
            public int compare(Customer cust1, Customer cust2)
            {
                return cust1.getAddress().getZipCode()
                    .compareTo(cust2.getAddress().getZipCode() );
            }
        });
        
        customers.sort( new Comparator<Customer>() {
            public int compare(Customer cust1, Customer cust2)
            {
                int rval = cust1.getLastName()
                    .compareTo( cust2.getLastName() );
                if ( rval == 0 )
                    rval = cust1.getFirstName()
                    .compareTo( cust2.getFirstName() );
                return rval;
            }
        });
        printList( customers );
    }
    
    private static void printList( List<?> list )
    {
        list.forEach( e -> System.out.println( e ));
    }
}
