package cp510.exercises;

/**
 * @author jack
 *
 */
public class Customer
{   
    private final String    firstName;
    private final String    lastName;
    private final Address   address;
    
    public Customer(String firstName, String lastName, Address address)
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Address getAddress()
    {
        return address;
    }
    
    @Override
    public String toString()
    {
        StringBuilder   bldr    = new StringBuilder();
        bldr.append( lastName ).append( "," ).append( firstName )
            .append( "," ).append( address );
        return bldr.toString();
    }
}
