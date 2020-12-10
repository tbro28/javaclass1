package cp510;

import java.awt.Color;
import java.awt.Graphics2D;

import uw.syp.java.tools.GWindow;
import uw.syp.java.tools.GWindowUser;

public class NestedClassDemo2
{
    private GWindow gWindow;
    private Color   backgroundColor = Color.LIGHT_GRAY;
    
    public static void main( String[] args )
    {
        NestedClassDemo2    demo    = new NestedClassDemo2();
        demo.show();
    }
    
    public NestedClassDemo2()
    {
        gWindow = new GWindow( 500, 300 );
        gWindow.setGWindowUser( new Painter() );
    }
    
    public void show()
    {
        gWindow.start();
    }
    
    private class Painter implements GWindowUser
    {
        public void redraw( Graphics2D gtx )
        {
            int gWidth  = gWindow.getWidth();
            int gHeight = gWindow.getHeight();
            
            gtx.setColor( backgroundColor );
            gtx.fillRect( 0, 0, gWidth, gHeight );
            
            gtx.setColor( Color.RED );
            gtx.drawOval( 10, 10, 100, 200 );
        }       
    }
}
