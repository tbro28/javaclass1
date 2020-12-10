package cp510.graphics_testing;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class DoYouSeeTest
{
    @Test
    void test()
    {
        int     startXco    = 10;
        int     startYco    = 10;
        int     startWidth  = 400;
        int     startHeight = 200;
        Color   bgColor     = new Color( 0x808080 );
        Color   fillColor   = null;
        Color   edgeColor   = Color.RED;
        int     edgeWidth   = 1;
        
        int     xco         = startXco;
        int     yco         = startYco;
        int     width       = startWidth;
        int     height      = startHeight;
        
        DoYouSeeDriver  driver  = new DoYouSeeDriver();
        verify( "Do you see a blank window?" );
        
        driver.setBackground( bgColor );
        driver.refresh();
        verify( "Do you see a blank window with a dark gray background?" );
        
        driver.setPosition( xco, yco );
        driver.setDimension( width, height );
        driver.setEdgeWidth( edgeWidth );
        driver.setColor( fillColor, edgeColor );
        driver.refresh();
        verify( "Do you see a rectangle"
                + " with a red edge and no fill"
                + " near the upper left corner?"
            );
        
        width = startWidth / 2;
        height = startHeight / 2;
        xco = startWidth - width - startXco;
        yco = startHeight - height - startYco;
        driver.setPosition(xco, yco);
        driver.setDimension(width, height);
        driver.setColor( Color.GREEN, null );
        driver.refresh();
        verify( "Do you see a smaller, green rectangle"
                + " with no edge"
                + " near the lower right corner?"
            );
    }
    
    private void verify( String prompt )
    {
        int resp    = JOptionPane.showConfirmDialog(
            null, 
            prompt, 
            "Validation Dialog", 
            JOptionPane.YES_NO_OPTION 
        );
        assertEquals( JOptionPane.YES_OPTION, resp );
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
