package cp510;

import java.util.Comparator;

public class Person
{
    private String name;
    private int    age;
    
    public static void main(String[] args)
    {
        PeepCompare comp    = new PeepCompare();
        Person  ab1 = new Person( "Abe", 42 );
        Person  ab2 = new Person( "Abe", 12 );
        Person  ze1 = new Person( "Zeb", 42 );
        Person  ze2 = new Person( "Zeb", 29 );
        String  fmt  = "%s; %s:: %3d%n";
        System.out.printf( fmt, ab1, ze1, comp.compare( ab1, ze1 ) );
        System.out.printf( fmt, ab1, ab2, comp.compare( ab1, ab2 ) );
        System.out.printf( fmt, ze1, ze2, comp.compare( ze1, ze2 ) );
        System.out.printf( fmt, ze2, ze2, comp.compare( ze2, ze2 ) );
    }
    
    public Person( String name, int age )
    {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString()
    {
        return name + ", " + age;
    }

    private static class PeepCompare
        implements Comparator<Person>
    {
        public int compare( Person peep1, Person peep2 )
        {
            int result  = peep1.name.compareTo( peep2.name );
            if ( result == 0 )
                result = peep1.age - peep2.age;
            return result;
        }
    }
}
