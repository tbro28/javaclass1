package cp510;

public class ShadowingDemo
{
    private static int  classVar    = 40;
    private        int  instVar     = -50;
    
    public static void main( String[] args )
    {
        new StaticTestClass().print();
        ShadowingDemo   demo    = new ShadowingDemo();
        demo.new InnerTestClass().print();
    }
    
    private static class StaticTestClass
    {
        private static String   classVar    = "Forty";
        
        public void print()
        {
            System.out.printf( "%s, %d%n", 
                classVar, ShadowingDemo.classVar );
        }
    }
    
    private class InnerTestClass
    {
        private static final double classVar    = 40.1;
        private double              instVar     = -50.1;
        
        public void print()
        {
            System.out.printf( "%f, %d%n", classVar, 
                ShadowingDemo.classVar );
            System.out.printf( "%f, %d%n", 
                instVar, ShadowingDemo.this.instVar );
        }
    }
}
