package cp510;

public class InnerClassDemo1
{
    private int ident   = 0x458B1C;
    public static void main(String[] args )
    {
        new InnerClassDemo1( "Thirsty" );
    }
    
    public InnerClassDemo1( String str )
    {
        Fish fish = new Fish();
        fish.speak( str );
    }
    
    private class Fish
    {
        public void speak( String toSay )
        {
            String  fmt = "Fish #%x says: %s%n";
            System.out.printf( fmt, ident, toSay );
        }
    }
}
