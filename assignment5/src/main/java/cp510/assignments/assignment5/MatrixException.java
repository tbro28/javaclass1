package cp510.assignments.assignment5;


/**
 *
 * Exception for errors related to matrices.
 *
 * @author Tim
 */
public class MatrixException extends RuntimeException {


    /**
     * Empty constructor for the class.
     */
    public MatrixException()
    {
    }

    /**
     *
     * Constructor with a string message.
     *
     * @param msg
     */
    public MatrixException( String msg )
    {
        super( msg );
    }


    /**
     *
     * Constructor with a string and Throwable cause.
     *
     * @param msg
     * @param cause
     */
    public MatrixException( String msg, Throwable cause )
    {
        super( msg, cause );
    }


    /**
     *
     * Constructor with a Throwable cause.
     *
     * @param cause
     */
    public MatrixException( Throwable cause )
    {
        super( cause );
    }


}
