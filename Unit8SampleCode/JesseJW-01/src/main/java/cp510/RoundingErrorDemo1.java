package cp510;

import java.awt.Color;
import java.awt.Graphics2D;

import uw.syp.java.tools.GWindow;
import uw.syp.java.tools.GWindowUser;

public class RoundingErrorDemo1 implements GWindowUser
{
    private Color   backgroundColor = Color.LIGHT_GRAY;
    private GWindow window;
    
    public static void main( String[] args )
    {
        new RoundingErrorDemo1().show();
    }
    
    public RoundingErrorDemo1()
    {
        window  = new GWindow( 300, 300 );
        window.setGWindowUser( this );
    }
    
    public void show()
    {
        window.start();
    }
    
    @Override
    public void redraw(Graphics2D gtx)
    {
        int     width   = window.getWidth();
        int     height  = window.getHeight();
        
        gtx.setColor( backgroundColor );
        gtx.fillRect( 0, 0, width, height );
        
        theWrongWay( gtx );
        theRightWay( gtx );
    }
    
    private void theWrongWay( Graphics2D gtx )
    {
        int     xco     = 0;
        int     yco     = window.getHeight();
        int     xco1    = (int)( xco + 2.5 );
        int     yco1    = (int)( yco - 2.5 );
        gtx.setColor( Color.RED );
        for ( int inx = 0 ; inx < 300 ; ++inx )
        {
            gtx.drawLine( xco, yco, xco1, yco1 );
            xco = xco1;
            yco = yco1;
            xco1 = (int)(xco + 2.5 );
            yco1 = (int)(yco - 2.5 );
        }
    }
    
    private void theRightWay( Graphics2D gtx )
    {
        int     yco     = window.getHeight();
        gtx.setColor( Color.BLUE );
        for ( int inx = 0 ; inx < 300 ; ++inx )
        {
            int xco1    = (int)(inx * 2.5 +.5 );
            int yco1    = yco - (int)(inx * 2.5 +.5 );
            int xco2    = (int)((inx + 1) * 2.5 +.5 );
            int yco2    = yco - (int)((inx + 1) * 2.5 +.5 );
            gtx.drawLine( xco1, yco1, xco2, yco2 );
        }
    }
}
