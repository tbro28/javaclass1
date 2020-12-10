package cp510;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import uw.syp.java.tools.GWindow;
import uw.syp.java.tools.GWindowUser;

public class ShapeDemo1 implements GWindowUser
{
    private Color   backgroundColor = Color.yellow;
    
    public static void main( String[] args )
    {
        new ShapeDemo1().show();
    }
    private GWindow window;
    
    public ShapeDemo1()
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
        
        Line2D      line    = new Line2D.Double( 0, 0, width, height );
        Ellipse2D   oval    = new Ellipse2D.Double( 50, 50, 100, 200 );
        Rectangle2D rect    = new Rectangle2D.Double( 40, 40, 120, 220 );
        gtx.setColor( Color.GREEN );
        gtx.setBackground(Color.ORANGE);

        gtx.fill( rect );
        gtx.setColor( Color.BLACK );
        gtx.draw( oval );
        gtx.draw( line );
    }
}
