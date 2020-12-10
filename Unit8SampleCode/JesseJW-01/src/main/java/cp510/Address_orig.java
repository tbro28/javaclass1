package cp510;

/**
 * @author jack
 *
 */
public class Address_orig implements Comparable<Address_orig>
{   
    private String  addr1;
    private String  addr2;
    private String  city;
    private String  state;
    private String  zipCode;
    
    /**
     * Compares this address to another for magnitude.
     * The value returned
     * will be:
     * <ul>
     * <li>&lt; 0, if this address is less than other;</li>
     * <li>= 0, if this address is equal to other;</li>
     * <li>&gt; 0, if this address is greater than other.</li>
     * </ul>
     * Comparison proceeds as follows:
     * <ol>
     * <li>Compare zip codes; if not equal we're done; else:</li>
     * <li>Compare states; if not equal we're done; else:</li>
     * <li>Compare cities; if not equal we're done; else:</li>
     * <li>Compare addr1 fields; if not equal we're done; else:</li>
     * <li>Compare addr2 fields.</li>
     * </ol>
     * @param other The other address to compare to.
     * @return &lt; 0, = 0 or &gt; 0, if this address is less than,
     *         equal to, or greater than the other address.
     */
    public int compareTo( Address_orig other )
    {
        int result  = zipCode.compareTo( other.zipCode );
        if ( result != 0 )
            return result;
        
        result = state.compareTo( other.state );
        if ( result != 0 )
            return result; 
        
        result = city.compareTo( other.city );
        if ( result != 0 )
            return result; 
        
        result = addr1.compareTo( other.addr1 );
        if ( result != 0 )
            return result; 
        
        result = addr2.compareTo( other.addr2 );
        return result; 
    }
}
