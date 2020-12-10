package cp510.exercises;

import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.util.function.Predicate;

import javax.swing.JFrame;

public class Utils
{
    public static Component findComponent( Predicate<Component> validator )
    {
        Component   comp    = null;
        
        Frame[] frames      = Frame.getFrames();
        int     numFrames   = frames.length;
//        System.out.printf(  "#frames = %d%n", numFrames );
        for ( int inx = 0 ; inx < numFrames && comp == null ; ++inx )
        {
            Frame   frame   = frames[inx];
            if ( frame.isVisible() )
            {
                if ( validator.test( frame ) )
                    comp = frame;
                else 
                {
                    Component   searchOn    = frame;
                    if ( frame instanceof JFrame )
                        searchOn = ((JFrame)frame).getContentPane();
                    comp = findComponent( searchOn, validator );
                }
            }
        }

        return comp;
    }
    
    public static void pause( long millis )
    {
        try
        {
            Thread.sleep( millis );
        }
        catch ( InterruptedException exc )
        {
            System.out.println( "interrupted" );
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
            {
                Component   nextComp    = children[inx];
                result = findComponent( nextComp, validator );
            }
        }
        
        return result;
    }
}
