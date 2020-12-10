package cp510.exercises;

import java.util.Comparator;
import java.util.List;

public class NestedClassesExPart1
{
    public static void main(String[] args)
    {
        List<Customer>  customers   = CustomerData.getCustomerData();
        customers.sort( new SortByCity() );
        customers.sort( new SortByZip() );
        customers.sort( new SortByName() );
        printList( customers );
    }
    
    private static void printList( List<?> list )
    {
        list.forEach( e -> System.out.println( e ));
    }
    
    private static class SortByCity implements Comparator<Customer>
    {
        @Override
        public int compare(Customer cust1, Customer cust2)
        {
            Address addr1   = cust1.getAddress();
            Address addr2   = cust2.getAddress();
            int rval    = addr1.getCity().compareTo( addr2.getCity() );
            if ( rval == 0 )
                rval = addr1.getZipCode().compareTo( addr2.getZipCode() );
            return rval;
        }
    }
        
    private static class SortByZip implements Comparator<Customer>
    {
        @Override
        public int compare(Customer cust1, Customer cust2)
        {
            Address addr1   = cust1.getAddress();
            Address addr2   = cust2.getAddress();
            int rval = addr1.getZipCode().compareTo( addr2.getZipCode() );
            return rval;
        }        
    }
    
    private static class SortByName implements Comparator<Customer>
    {
        @Override
        public int compare(Customer cust1, Customer cust2)
        {
            int rval = 
                cust1.getLastName().compareTo( cust2.getLastName() );
            return rval;
        }        
    }
}
