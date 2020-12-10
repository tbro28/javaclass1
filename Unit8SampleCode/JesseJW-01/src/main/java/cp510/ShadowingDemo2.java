package cp510;

public class ShadowingDemo2
{
    public static void main( String[] args )
    {
        ShadowingDemo2  demo    = new ShadowingDemo2();
        InnerTestClass  test    = demo.new InnerTestClass();
        test.printClass();
        test.printInstance();
    }
    
    private static void printClass()
    {
        System.out.println( "ShadowDemo2, Class Method" );
    }
    
    private void printInstance()
    {
        System.out.println( "ShadowDemo2, Instance Method" );
    }
    
    private class InnerTestClass
    {
        private void printClass()
        {
            System.out.println( "ShadowDemo2.InnerTestClass Method 1" );
            ShadowingDemo2.printClass();
        }
        
        private void printInstance()
        {
            System.out.println( "ShadowDemo2.InnerTestClass Method 2" );
            ShadowingDemo2.this.printInstance();
        }
    }
}
