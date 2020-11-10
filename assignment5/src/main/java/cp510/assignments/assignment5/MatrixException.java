package cp510.assignments.assignment5;

public class MatrixException extends RuntimeException {

    public MatrixException()
    {
    }

    public MatrixException( String msg )
    {
        super( msg );
    }

    public MatrixException( String msg, Throwable cause )
    {
        super( msg, cause );
    }

    public MatrixException( Throwable cause )
    {
        super( cause );
    }


}
