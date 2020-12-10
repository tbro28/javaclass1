package cp510.graphics_testing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import uw.syp.java.tools.GWindow;
import uw.syp.java.tools.GWindowUser;

public class Setup implements GWindowUser
{
    private static final Color  gbColor = Color.LIGHT_GRAY;
    private static final Color  color   = new Color( 0x013220 );
    private final GWindow       gWindow = new GWindow( 60, 60 );
    
    public static void main(String[] args)
    {
        new Setup();
    }
    
    public Setup()
    {
        gWindow.setGWindowUser( this );
        gWindow.start();
        BufferedImage   bitmap  = getBitmap();
        dumpBitmap( bitmap );
    }
    
    private BufferedImage getBitmap()
    {
        int             width   = 40;//pane.getWidth();
        int             height  = 40;//pane.getHeight();
        int             type    = BufferedImage.TYPE_3BYTE_BGR;
        BufferedImage   bitmap  = new BufferedImage( width, height, type );
        Graphics        gtx     = bitmap.getGraphics();
        gtx.setClip( 0, 0, width, height );
        redraw( (Graphics2D)gtx );
        return bitmap;
    }

    private void dumpBitmap( BufferedImage image )
    {
        int             width   = image.getWidth();
        int             height  = image.getHeight();
        int             bgColor = image.getRGB( 0, 0 );
        for ( int yco = 0 ; yco < height ; ++yco )
        {
            for ( int xco = 0 ; xco < width ; ++xco )
            {
                int     color   = image.getRGB( xco, yco );
                char    out     = color == bgColor ? 'b' : 'F';
                System.out.print( out );
            }
            System.out.println();
        }
    }
    
    @Override
    public void redraw(Graphics2D gtx)
    {
        Rectangle bounds = gtx.getClipBounds();
        int     width   = bounds.width;
        int     height  = bounds.height;
        gtx.setColor( gbColor );
        gtx.fillRect( 0,  0, width, height);
        
        int margin  = 10;
        int rWidth  = width - 2 * margin;
        int rHeight = height - 2 * margin;
        gtx.setColor( color );
        gtx.fillRect( margin, margin, rWidth, rHeight );
    }
}
