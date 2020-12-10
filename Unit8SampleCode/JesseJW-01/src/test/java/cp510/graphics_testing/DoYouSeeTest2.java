package cp510.graphics_testing;

import static org.junit.jupiter.api.Assertions.fail;

import java.awt.Color;
import java.awt.Component;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

class DoYouSeeTest2
{
    @Test
    void test()
    {
        Predicate<Component>    pred    =
            new Predicate<Component>() {
                public boolean test( Component c )
                {
                    return c.getClass().getName().contains( "GPanel" );
                }
        };
        
        Color   fillColor   = Color.RED;
        Color   bgColor     = new Color( 0x808080 );
        
        int     xco         = 0;
        int     yco         = 0;
        int     width       = 100;
        int     height      = 50;
        
        DoYouSeeDriver2 driver  = new DoYouSeeDriver2();
        Utils.pause( 250 );
        Component   canvas  = Utils.findComponent( pred );
        System.out.println( canvas );
        
        driver.setBackground( bgColor );
        driver.refresh();
        
        driver.setPosition( xco, yco );
        driver.setDimension( width, height );
        driver.setColor( fillColor );
        driver.refresh();
    }
    
    @Test
    void testDoYouSeeDriver()
    {
        fail("Not yet implemented");
    }

    @Test
    void testRedraw()
    {
        fail("Not yet implemented");
    }

    @Test
    void testSetPosition()
    {
        fail("Not yet implemented");
    }

    @Test
    void testSetDimension()
    {
        fail("Not yet implemented");
    }

    @Test
    void testSetBackground()
    {
        fail("Not yet implemented");
    }

    @Test
    void testSetColor()
    {
        fail("Not yet implemented");
    }

}
