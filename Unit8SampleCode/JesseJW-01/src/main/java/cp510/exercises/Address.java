package cp510.exercises;

/**
 * @author jack
 *
 */
public class Address
{   
    private final String    addr;
    private final String    city;
    private final String    state;
    private final String    zipCode;
    
    public Address(String addr, String city, String state, String zipCode)
    {
        super();
        this.addr = addr;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAddr()
    {
        return addr;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    @Override
    public String toString()
    {
        StringBuilder   bldr    = new StringBuilder();
        bldr.append( addr ).append(",")
            .append( city ).append( "," )
            .append( state ).append( "," )
            .append( zipCode );
        return bldr.toString();
    }
}
