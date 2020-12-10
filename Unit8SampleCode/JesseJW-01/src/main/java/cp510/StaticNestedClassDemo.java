package cp510;

public class StaticNestedClassDemo
{
    static int xier     = 3;
    static int demoInt  = 5;
    
    public static void main(String[] args)
    {
        Demo.execute();
    }

    private static int funk1( int param )
    {
        return param * xier;
    }
    
    private static class Demo
    {
        public static void execute()
        {
            System.out.println( funk1( demoInt ) );
        }
    }
}
