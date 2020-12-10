package cp510.customer_generator;

@SuppressWarnings("serial")
public class ParseException extends RuntimeException
{
    public ParseException()
    {
    }

    public ParseException(String message)
    {
        super(message);
    }

    public ParseException(Throwable cause)
    {
        super(cause);
    }

    public ParseException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
