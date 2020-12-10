package cp510.graphics_testing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import uw.syp.java.tools.GWindow;
import uw.syp.java.tools.GWindowUser;

public class GWindowDemo implements GWindowUser
{
    private final List<Rectangle2D> rects   = new ArrayList<>();
    private Color                   bgColor = Color.WHITE;
    private Color                   color   = Color.BLACK;
    private final GWindow           gWindow;
    
    public GWindowDemo( int width, int height )
    {
        gWindow = new GWindow( width, height );
        gWindow.setGWindowUser( this );
        gWindow.start();
    }
    
    public void addRect( Rectangle2D rect )
    {
        rects.add( rect );
    }
    
    public void refresh()
    {
        gWindow.repaint();
    }
    
    public BufferedImage getBitmap()
    {
        return gWindow.getBitmap();
    }

    public void setBgColor(Color bgColor)
    {
        this.bgColor = bgColor;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    @Override
    public void redraw( Graphics2D gtx )
    {
        int width   = gWindow.getWidth();
        int height  = gWindow.getHeight();
        gtx.setColor( bgColor );
        gtx.fillRect( 0, 0, width, height );
        
        gtx.setColor( color );
        for ( Rectangle2D rect : rects )
            gtx.fill( rect );

    }
}
