package misc;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import uw.syp.java.tools.GWindow;
import uw.syp.java.tools.GWindowUser;

public class StrokeTest implements GWindowUser
{
    private GWindow gWindow = new GWindow( 400, 400 );
    public static void main(String[] args)
    {
        new StrokeTest();
    }
    
    public StrokeTest()
    {
        gWindow.setGWindowUser( this );
        gWindow.start();
    }

    @Override
    public void redraw(Graphics2D gtx)
    {
        int         canWidth    = gWindow.getWidth();
        int         canHeight   = gWindow.getHeight();
        int         xco         = 25;
        int         yco         = 25;
        int         width       = 100;
        int         height      = 100;
        int         right       = xco + width;
        int         bottom      = yco + height;
        Stroke      stroke      = new BasicStroke( 20 );
        Rectangle2D rect        = new Rectangle2D.Double( xco, yco, width, height );
        Line2D      topBound    = new Line2D.Double( 0, yco, canWidth, yco );
        Line2D      rightBound  = new Line2D.Double( right, 0, right, canHeight );
        Line2D      lowerBound  = new Line2D.Double( 0, bottom, canWidth, bottom );
        Line2D      leftBound   = new Line2D.Double( xco, 0, xco, canHeight );
        
        gtx.setColor( Color.LIGHT_GRAY );
        gtx.fillRect( 0,  0,  canWidth,  canHeight );
        
        gtx.setStroke( stroke );
        gtx.setColor( Color.BLACK );
        gtx.draw( rect );
        gtx.setColor( Color.CYAN );
        gtx.fill( rect );
        gtx.setColor( Color.RED );
        gtx.setStroke( new BasicStroke( 1 ) );
        gtx.draw( topBound );
        gtx.draw( rightBound );
        gtx.draw( lowerBound );
        gtx.draw( leftBound );
    }
}
