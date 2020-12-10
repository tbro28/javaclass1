package cp510;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import uw.syp.java.tools.GWindow;
import uw.syp.java.tools.GWindowUser;

public class ShapeDemo2 implements GWindowUser
{
    private Color   backgroundColor = Color.LIGHT_GRAY;
    
    public static void main( String[] args )
    {
        new ShapeDemo2().show();
    }
    private GWindow window;
    
    public ShapeDemo2()
    {
        window  = new GWindow( 250, 300 );
        window.setGWindowUser( this );
    }
    
    public void show()
    {
        window.start();
    }
    
    @Override
    public void redraw(Graphics2D gtx)
    {
        int width   = window.getWidth();
        int height  = window.getHeight();
        gtx.setColor( backgroundColor );
        gtx.fillRect( 0, 0, width, height );
        
        Ellipse2D   oval    = new Ellipse2D.Double( 50, 50, 100, 200 );
        gtx.setColor( Color.GREEN );
        gtx.fill( oval );
        gtx.setColor( Color.BLACK );
        gtx.setStroke( new BasicStroke( 4 ) );
        gtx.draw( oval );
    }
}
