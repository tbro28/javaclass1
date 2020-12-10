package cp510.graphics_testing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.util.function.Predicate;

import javax.swing.JFrame;

public class Utils
{
    public static Component findCompByName( String name )
    {
        return findComponent( c -> name.equals( c.getName() ) );
    }
    
    public static Component findCompByNameAlt( String name )
    {
        Component   comp    = findComponent( new Predicate<Component>() {
            public boolean test( Component c ) {
                return name.equals( c.getName() );
            }
        });
        return comp;
    }
    
    public static Component findComponent( Predicate<Component> validator )
    {
        Component   comp    = null;
        
        Frame[] frames      = Frame.getFrames();
        int     numFrames   = frames.length;
        for ( int inx = 0 ; inx < numFrames && comp == null ; ++inx )
        {
            Component   toSearch    = frames[inx];
            if ( toSearch.isVisible() )
            {
                if ( validator.test( toSearch ) )
                    comp = toSearch; // done
                else
                {
                    if ( comp instanceof JFrame )
                        toSearch = ((JFrame)toSearch).getContentPane();
                    comp = findComponent( toSearch, validator );
                }
            }
        }

        return comp;
    }
    
    public static boolean 
    testEquals( BufferedImage image1, BufferedImage image2 )
    {
        int     width   = image1.getWidth();
        int     height  = image1.getHeight();
        boolean rcode   = 
            width == image2.getWidth() && height == image2.getHeight();
        for ( int yco = 0 ; yco < height && rcode ; ++yco )
            for ( int xco = 0 ; xco < width && rcode ; ++xco )
            {
                int color1  = image1.getRGB( xco, yco );
                int color2   = image2.getRGB( xco, yco );
                rcode = color1 == color2;
            }
        return rcode;
    }

    
    public static void pause( long millis )
    {
        long    now = System.currentTimeMillis();
        long    end = now + millis;
        while ( (now = System.currentTimeMillis()) < end )
        {
            try
            {
                Thread.sleep( end - now );
            }
            catch ( InterruptedException exc )
            {
                // don't care
            }
        }
    }
    
    private static Component 
    findComponent( Component comp, Predicate<Component> validator )
    {
        Component   result      = validator.test( comp ) ? comp : null;
        if ( result == null && comp instanceof Container )
        {
            Component[] children    = ((Container)comp).getComponents();
            int         limit       = children.length;
            for ( int inx = 0 ; inx < limit && result == null ; ++inx )
                result = findComponent( children[inx], validator );
        }
        
        return result;
    }
}
