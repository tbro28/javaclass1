package cp510.graphics_testing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import uw.syp.java.tools.GWindow;
import uw.syp.java.tools.GWindowUser;

public class DoYouSeeDriver implements GWindowUser
{
    private GWindow gWindow = new GWindow( 500, 500 );
    private int     xco         = 0;
    private int     yco         = 0;
    private int     width       = 0;
    private int     height      = 0;
    private int     edgeWidth   = 0;
    private Color   color       = null;
    private Color   edgeColor   = null;
    private Color   bgColor     = null;
    
    public DoYouSeeDriver()
    {
        gWindow.setGWindowUser( this );
        gWindow.start();
    }
    
    public void refresh()
    {
        gWindow.repaint();
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
    
    public void setEdgeWidth( int width )
    {
        edgeWidth = width;
    }
    
    public void setBackground( Color color )
    {
        bgColor = color;
    }
    
    public void setColor( Color color, Color edgeColor )
    {
        this.color = color;
        this.edgeColor = edgeColor;
    }

    @Override
    public void redraw(Graphics2D gtx)
    {
        if ( bgColor != null )
        {
            int width   = gWindow.getWidth();
            int height  = gWindow.getHeight();
            gtx.setColor( bgColor );
            gtx.fillRect( 0, 0, width, height);
        }
        
        if ( color != null )
        {
            gtx.setColor( color );
            gtx.fillRect( xco, yco, width, height);
        }
        
        if ( edgeColor != null && edgeWidth > 0 )
        {
            gtx.setColor( edgeColor );
            gtx.setStroke( new BasicStroke( edgeWidth ) );
            gtx.drawRect(xco, yco, width, height);
        }
    }
}
