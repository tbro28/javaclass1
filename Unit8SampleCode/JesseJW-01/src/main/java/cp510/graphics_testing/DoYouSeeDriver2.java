package cp510.graphics_testing;

import java.awt.Color;
import java.awt.Graphics2D;

import uw.syp.java.tools.GWindow;
import uw.syp.java.tools.GWindowUser;

public class DoYouSeeDriver2 implements GWindowUser
{
    private GWindow gWindow = new GWindow( 500, 500 );
    private int     xco         = 0;
    private int     yco         = 0;
    private int     width       = 0;
    private int     height      = 0;
    private Color   color       = null;
    private Color   bgColor     = null;
    
    public DoYouSeeDriver2()
    {
        gWindow.setGWindowUser( this );
        gWindow.start();
    }
    
    public void refresh()
    {
        gWindow.repaint();
    }
    
    public void setBackground( Color color )
    {
        if ( color == null )
            throw new IllegalArgumentException( "Color may not be null" );
        bgColor = color;
    }
    
    public void setPosition( int xco, int yco )
    {
        this.xco = xco;
        this.yco = yco;
    }
    
    public void setDimension( int width, int height )
    {
        this.width = width;
        this.height = height;
    }
    
    public void setColor( Color color )
    {
        if ( color == null )
            throw new IllegalArgumentException( "Color may not be null" );
        this.color = color;
    }

    @Override
    public void redraw(Graphics2D gtx)
    {
        int wWidth   = gWindow.getWidth();
        int wHeight  = gWindow.getHeight();
        gtx.setColor( bgColor );
        gtx.fillRect( 0, 0, wWidth, wHeight);
        
        gtx.setColor( color );
        gtx.fillRect( xco, yco, width, height);
    }
}
